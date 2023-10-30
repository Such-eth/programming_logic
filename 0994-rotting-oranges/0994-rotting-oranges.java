class Solution {
    class Pair{
        int f;
        int s;
        int t;
        public Pair(int f,int s, int t){
            this.f=f;
            this.s=s;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        int time=0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));
                }
                if(grid[i][j]==1)
                    count++;
            }
        }
        while(!q.isEmpty()){
            Pair pair = q.poll();
            int row = pair.f;
            int col = pair.s;
            time=Math.max(time,pair.t);
            int[] drow = {0,1,0,-1};
            int[] dcol = {1,0,-1,0};
            for(int k=0;k<4;k++){
                int r = row+drow[k];
                int c = col+dcol[k];
                if(r>=0 && r<m && c>=0 && c<n && grid[r][c]==1 && vis[r][c]!=2){
                    q.add(new Pair(r,c,pair.t+1));
                    vis[r][c]=2;
                    count--;
                }
            }
        }
        if(count==0)
            return time;
        return -1;
    }
}