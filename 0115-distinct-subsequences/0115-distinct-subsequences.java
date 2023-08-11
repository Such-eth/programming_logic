class Solution {
    public int[][] dp;
    public int numDistinct(String s, String t) {
        dp = new int[s.length()][t.length()];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return subseq(s,t,s.length()-1,t.length()-1);
    }
    
    public int subseq(String s1,String s2,int i,int j){
        if(j<0)
            return 1;
        if(i<0)
            return 0;   
        if(dp[i][j]>-1)
            return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return dp[i][j] = subseq(s1,s2,i-1,j-1)+subseq(s1,s2,i-1,j);
        return dp[i][j] = subseq(s1,s2,i-1,j);
    }
}