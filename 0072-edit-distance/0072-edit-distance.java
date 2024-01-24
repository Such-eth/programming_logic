class Solution {
    public int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()+1][word2.length()+1];
        // for(int[] i:dp){
        //     Arrays.fill(i,-1);
        // }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(word1.charAt(i)==word2.charAt(j))
                    dp[i+1][j+1] = dp[i][j];
                else{
                    int in=1+dp[i+1][j];
                    int del=1+dp[i][j+1];
                    int rep=1+dp[i][j];
                    dp[i+1][j+1]=Math.min(in,Math.min(del,rep));
                }
            }
        }
        return dp[word1.length()][word2.length()];
        // int x = mini(word1,word2,word1.length()-1,word2.length()-1);
        // for(int[] i:dp)
        //     System.out.println(Arrays.toString(i));
        // return x;
    }
    // public int mini(String s1,String s2,int i,int j){
    //     if(i<0){
    //         return j+1;
    //     }
    //     if(j<0)
    //         return i+1;
    //     if(dp[i][j]>-1)
    //         return dp[i][j];
    //     // int ans=Integer.MAX_VALUE;
    //     // for(int[] ig:dp)
    //     //     System.out.println(Arrays.toString(ig));
    //     if(s1.charAt(i)==s2.charAt(j))
    //         return dp[i][j]=mini(s1,s2,i-1,j-1);
    //     int in=1+mini(s1,s2,i,j-1);
    //     int del=1+mini(s1,s2,i-1,j);
    //     int rep=1+mini(s1,s2,i-1,j-1);
    //     return dp[i][j]=Math.min(in,Math.min(del,rep));
    // }
}