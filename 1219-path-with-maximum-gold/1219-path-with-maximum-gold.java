class Solution {
    int ans=0;
    public int getMaximumGold(int[][] grid) {
        ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    helper(grid,i,j,0);
                    System.out.println(ans);
                }
            }
        }
        return ans;
    }
    public void helper(int[][] grid,int r,int c,int val){
        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length || grid[r][c]==0){
            ans=Math.max(val,ans);
            return;
        }
        int num=grid[r][c];
        grid[r][c]=0;
        helper(grid,r+1,c,val+num);
        helper(grid,r-1,c,val+num);
        helper(grid,r,c+1,val+num);
        helper(grid,r,c-1,val+num);
        grid[r][c]=num;
    }
}