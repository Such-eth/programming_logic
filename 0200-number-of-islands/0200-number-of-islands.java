class Solution {
    class Node{
        int f,s;
        public Node(int a,int s){
            this.f=a;
            this.s=s;
        }
    }

    public int numIslands(char[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Node> q = new LinkedList<>();
        int ans=0;
        int[][] vis = new int[m][n];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && vis[i][j]!=1){
                    ans++;
                    vis[i][j]=1;
                    q.offer(new Node(i,j));
                    while(!q.isEmpty()){
                        Node node = q.poll();
                        int row = node.f;
                        int col = node.s;
                        int[] drow = {-1,0,1,0};
                        int[] dcol = {0,1,0,-1};
                        for(int k=0;k<4;k++){
                            int r = row+drow[k];
                            int c = col+dcol[k];
                            if(r>=0 && r<m && c>=0 && c<n && grid[r][c]=='1' && vis[r][c]==0){
                                vis[r][c]=1;
                                q.add(new Node(r,c));
                                
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}