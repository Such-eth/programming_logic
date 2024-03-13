class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        return find(s,rev);
    }
    // public int find(String s1, String s2, int i,int j){
    //     if(i<0 || j<0)
    //         return 0;
    //     if(s1.charAt(i)==s2.charAt(j))
    //         return 1+find(s1,s2,i-1,j-1);
    //     int fir = find(s1,s2,i-1,j);
    //     int sec = find(s1,s2,i,j-1);
    //     return Math.max(fir,sec);
    // }
    public int find(String s1, String s2){
        int n = s1.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n][n];
    }
}