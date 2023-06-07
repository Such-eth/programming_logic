class Solution {
    int[][] dp;
    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        // System.out.println(triangle.get(triangle.size()-1).size());
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<dp[0].length;i++){
            dp[dp.length-1][i]=triangle.get(triangle.size()-1).get(i);
        }
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        // return mini(triangle,0,0);
        return dp[0][0];
    }
    // public int mini(List<List<Integer>> l,int i,int j){
    //     if(i>l.size()-1)
    //         return Integer.MAX_VALUE;
    //     if(i==l.size()-1)
    //         return l.get(i).get(j);
    //     if(dp[i][j]>-1)
    //         return dp[i][j];
    //     dp[i][j] = l.get(i).get(j)+Math.min(mini(l,i+1,j),mini(l,i+1,j+1));
    //     return dp[i][j];
    // }
}