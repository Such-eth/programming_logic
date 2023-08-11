class Solution {
    public int[][] dp;
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()][s2.length()];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return min_del(s1,s2,s1.length()-1,s2.length()-1);
    }
    
    public int min_del(String s1,String s2,int i,int j){
        if(i<0){
            int sum=0;
            for(int k=0;k<=j;k++){
                sum+=(int)s2.charAt(k);
            }
            return sum;
        }
        if(j<0){
            int sum=0;
            for(int k=0;k<=i;k++){
                sum+=(int)s1.charAt(k);
            }
            return sum;
        }
        if(dp[i][j]!=-1)
            return dp[i][j];
        int ans = Integer.MAX_VALUE;
        int equal,not_equal;
        if(s1.charAt(i)==s2.charAt(j))
            ans = Math.min(ans,min_del(s1,s2,i-1,j-1));
        else{
            ans = Math.min(ans,Math.min(min_del(s1,s2,i-1,j)+(int)s1.charAt(i),min_del(s1,s2,i,j-1)+(int)s2.charAt(j)));
        }
        return dp[i][j]=ans;
    }
}