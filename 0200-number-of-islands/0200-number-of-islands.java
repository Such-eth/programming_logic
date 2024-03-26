class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(grid,vis,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] g, int[][] vis,int i,int j){
        vis[i][j]=1;
        int row = i;
        int col = j;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        for(int k=0;k<4;k++){
            int r = row+drow[k];
            int c = col+dcol[k];
            if(r>=0 && r<g.length && c>=0 && c<g[0].length && g[r][c]=='1' && vis[r][c]==0){
                dfs(g,vis,r,c);
            }
        }
    }
}