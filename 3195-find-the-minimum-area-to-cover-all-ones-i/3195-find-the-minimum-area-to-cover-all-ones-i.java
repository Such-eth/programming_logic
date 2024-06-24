class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length,m=grid[0].length;
        int top=-1,bot=grid.length-1,right=0,left=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(top==-1) top = i;
                    if(j<left) left=j;
                    if(j>right) right=j;
                    bot=i;
                }
            }
        }
        // System.out.println(top+" "+bot+" "+left+" "+right);
        int area = (bot-top+1)*(right-left+1);
        return area;
    }
}