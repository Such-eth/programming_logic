class Solution {
    public int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return mini(word1,word2,word1.length()-1,word2.length()-1);
    }
    public int mini(String s1,String s2,int i,int j){
        if(i<0){
            return j+1;
        }
        if(j<0)
            return i+1;
        if(dp[i][j]>-1)
            return dp[i][j];
        // int ans=Integer.MAX_VALUE;
        if(s1.charAt(i)==s2.charAt(j))
            return mini(s1,s2,i-1,j-1);
        int in=1+mini(s1,s2,i,j-1);
        int del=1+mini(s1,s2,i-1,j);
        int rep=1+mini(s1,s2,i-1,j-1);
        return dp[i][j]=Math.min(in,Math.min(del,rep));
    }
}