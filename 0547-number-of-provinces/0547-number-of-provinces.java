class Solution {
    public int[] visited;
    public int x;
    public int findCircleNum(int[][] isConnected) {
        // List<List<Integer>> graph = new ArrayList<>();
        // for(int i=0;i<=isConnected.length;i++){
        //     graph.add(new ArrayList<>());
        // }
        // for(int i=0;i<isConnected[0].length;i++){
        //     for (int j=0;j<isConnected.length;j++){
        //         if(isConnected[j][i]==1 ){
        //             graph.get(j+1).add(i+1);
        //         }
        //     }
        // }
        visited = new int[isConnected.length];
        int ans=0;
        x=0;
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                ans++;
                dfs(isConnected,i);
            }
        }
        return ans;
    }

    // private int[] dfs(List<List<Integer>> graph,int head) {
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(head);
    //     visited[head]=1;
    //     while(!q.isEmpty()){
    //         Integer curr = q.poll();
    //         for(int num : graph.get(curr)){
    //             if(visited[num]==0){
    //                 visited[num]=1;
    //                 q.add(num);
    //             }
    //         }
    //     }
    //     return visited;
    // }
    
    private void dfs(int[][] graph, int node){
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited[node]=1;
        while(!q.isEmpty()){
            Integer curr = q.poll();
            for(int i=0;i<graph.length;i++){
                if(graph[curr][i]==1 && visited[i]==0){
                    visited[curr]=1;
                    q.offer(i);
                }
            }
        }
        // System.out.println(x++ +" ");
    }
}