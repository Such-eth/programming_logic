class Solution {
    int ans;
    int[][] vis;
    public int maxAreaOfIsland(int[][] grid) {
        ans=0;
        int m=grid.length;
        int n=grid[0].length;
        vis = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    ans=Math.max(ans,bfs(grid,vis,i,j));
                }
            }
        }
        return ans;
    }
    public int bfs(int[][] grid,int[][]vis,int row,int col){
        int area=1;
        vis[row][col]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty())
        {
            Pair pair = q.poll();
            int r = pair.f;
            int c = pair.s;
            int[] dr = {-1,0,1,0};
            int[] dc = {0,1,0,-1};
            for(int i=0;i<4;i++){
                row = r+dr[i];
                col = c+dc[i];
                if(row>=0 && row<grid.length &&col>=0 && col<grid[0].length && grid[row][col]==1 && vis[row][col]==0){
                    area++;
                    q.add(new Pair(row,col));
                    vis[row][col]=1;
                }
            }
        }
        return area;
    }
    
    class Pair{
        int f;
        int s;
        public Pair(int f,int s){
            this.f = f;
            this.s= s;
        }
    }
}