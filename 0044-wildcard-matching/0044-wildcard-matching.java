class Solution {
    int[][] dp;
    
    public boolean val(int[][] arr,int i,int j){
        if(arr[i][j]==0)
            return false;
        return true;
    }
    
    public int cast(boolean foo){
        return (foo) ? 1 : 0;
    }
    
    public boolean isMatch(String s, String p) {
        dp = new int[s.length()][p.length()];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return match(s,p,s.length()-1,p.length()-1);
    }
    
    public boolean match(String s1, String s2, int i, int j){
        if(j<0){
            return i<0;
        }
        if(i<0){
            for(int k=0;k<=j;k++){
                if(s2.charAt(k)!='*')
                    return false;
            }
            return true;
        }
        if(dp[i][j]!=-1)
            return val(dp,i,j);
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=cast(match(s1,s2,i-1,j-1));
            return val(dp,i,j);
        }
        if(s2.charAt(j)=='?'){
            dp[i][j]=cast(match(s1,s2,i-1,j-1));
            return val(dp,i,j);
        }
        if(s2.charAt(j)=='*'){
            // boolean ans=false;
            // for(int k=0;k<=j;k++){
            //     ans = ans || match(s1,s2,i-1,j-k);
            // }
            // dp[i][j]=cast(ans);
            // return val(dp,i,j);
            dp[i][j]=cast(match(s1,s2,i-1,j) || match(s1,s2,i,j-1));
            return val(dp,i,j);
        }
        return false;
    }
}