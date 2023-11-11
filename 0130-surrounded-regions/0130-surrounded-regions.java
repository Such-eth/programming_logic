class Solution {
    int[][] vis;
    public void solve(char[][] board) {
        int m=board.length;
        int n = board[0].length;
        // char[][] vis = new char[m][n];
        // for(char[] v:vis)
        //     Arrays.fill(v,'X');
        vis = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1){
                    if(board[i][j]=='O' && vis[i][j]!=1){
                        bfs(board,vis,i,j);
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==1)
                    board[i][j]='O';
                else
                    board[i][j]='X';
            }
        }
    }
    public void bfs(char[][] grid,int[][]vis,int row,int col){
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
                if(row>=0 && row<grid.length &&col>=0 && col<grid[0].length && grid[row][col]=='O' && vis[row][col]==0){
                    q.add(new Pair(row,col));
                    vis[row][col]=1;
                }
            }
        }
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