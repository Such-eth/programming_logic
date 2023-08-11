class Solution {
    public int[][] dp;
    public int numDistinct(String s, String t) {
        dp = new int[s.length()+1][t.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return subseq1(s,t);
    }
    
    public int subseq(String s1,String s2,int i,int j){
        if(j==0)
            return 1;
        if(i==0)
            return 0;   
        if(dp[i][j]>-1)
            return dp[i][j];
        if(s1.charAt(i-1)==s2.charAt(j-1))
            return dp[i][j] = subseq(s1,s2,i-1,j-1)+subseq(s1,s2,i-1,j);
        return dp[i][j] = subseq(s1,s2,i-1,j);
    }
    
    public int subseq1(String s1,String s2){
        int m = s1.length(),n=s2.length();
        int[][] arr = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            arr[i][0]=1;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                else
                    arr[i][j] = arr[i-1][j];
            }
        }
        return arr[m][n];
    }
}