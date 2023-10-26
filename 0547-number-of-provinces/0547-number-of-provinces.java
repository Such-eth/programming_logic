class Solution {
    public int[] visited;
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<=isConnected.length;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected[0].length;i++){
            for (int j=0;j<isConnected.length;j++){
                if(isConnected[j][i]==1 ){
                    graph.get(j+1).add(i+1);
                }
            }
        }
        visited = new int[isConnected.length+1];
        int ans=0;
        for(int i=1;i<visited.length;i++){
            if(visited[i]==0){
                ans++;
                dfs(graph,i);
            }
        }
        return ans;
    }

    private int[] dfs(List<List<Integer>> graph,int head) {
        Queue<Integer> q = new LinkedList<>();
        q.add(head);
        visited[head]=1;
        while(!q.isEmpty()){
            Integer curr = q.poll();
            for(int num : graph.get(curr)){
                if(visited[num]==0){
                    visited[num]=1;
                    q.add(num);
                }
            }
        }
        return visited;
    }
}