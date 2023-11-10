class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans=0;
        int[][] vis = new int[grid.length][grid[0].length];
        for(int i=0;i<n;i++){
            if(grid[0][i]==1 && vis[0][i]==0)
                search(grid,vis,0,i);
            if(grid[m-1][i]==1 && vis[m-1][i]==0)
                search(grid,vis,m-1,i);                
        }
        for(int i=1;i<m-1;i++){
            if(grid[i][0]==1 && vis[i][0]==0)
                search(grid,vis,i,0);
            if(grid[i][n-1]==1 && vis[i][n-1]==0)
                search(grid,vis,i,n-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0)
                    ans++;
            }
        }
        return ans;
    }
    public void search(int[][] graph,int[][] vis,int row,int col){
        vis[row][col]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int r=pair.f;
            int c=pair.s;
            int[] drow = {-1,0,1,0};
            int[] dcol = {0,1,0,-1};
            for(int i=0;i<4;i++){
                int dr = r+drow[i];
                int dc = c+dcol[i];
                if(dr>=0 && dr<graph.length && dc>=0 && dc<graph[0].length && graph[dr][dc]==1 && vis[dr][dc]==0){
                    vis[dr][dc]=1;
                    q.add(new Pair(dr,dc));
                }
            }
        }
    }
    class Pair{
        int f;
        int s;
        public Pair(int f,int s){
            this.f = f;
            this.s = s;
        }
    }
}