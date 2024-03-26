class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++)
                g.get(i).add(graph[i][j]);
        }
        int[] col = new int[n];
        Arrays.fill(col,-1);
        for(int i=0;i<n;i++){
            if(col[i]==-1){
                if(fill(g,col,i,0)==false)
                    return false;
            }
        }
        return true;
    }
    public boolean fill(List<List<Integer>> g, int[] col, int ind,int c){
        col[ind]=c;
        for(int i:g.get(ind)){
            if(col[i]==-1){
                if(fill(g,col,i,1-c)==false) return false;
            }else if(col[i]==c) return false;
        }
        return true;
    }
}