class Solution {
    public int[][] dp;
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length()+1][s2.length()+1];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return min_del1(s1,s2);
    }
    
    // public int min_del(String s1,String s2,int i,int j){
    //     if(i==0){
    //         int sum=0;
    //         for(int k=1;k<=j;k++){
    //             sum+=(int)s2.charAt(k-1);
    //         }
    //         return sum;
    //     }
    //     if(j==0){
    //         int sum=0;
    //         for(int k=1;k<=i;k++){
    //             sum+=(int)s1.charAt(k-1);
    //         }
    //         return sum;
    //     }
    //     if(dp[i][j]!=-1)
    //         return dp[i][j];
    //     int ans = Integer.MAX_VALUE;
    //     int equal,not_equal;
    //     if(s1.charAt(i-1)==s2.charAt(j-1))
    //         ans = Math.min(ans,min_del(s1,s2,i-1,j-1));
    //     else{
    //         ans = Math.min(ans,Math.min(min_del(s1,s2,i-1,j)+(int)s1.charAt(i-1),min_del(s1,s2,i,j-1)+(int)s2.charAt(j-1)));
    //     }
    //     return dp[i][j]=ans;
    // }
    
    public int min_del1(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int[][] arr = new int[m+1][n+1];
        for(int i=1;i<=n;i++){
            arr[0][i] = arr[0][i-1]+s2.charAt(i-1);
        }
        for(int i=1;i<=m;i++){
            arr[i][0] = arr[i-1][0]+s1.charAt(i-1);
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1];
                else{
                    arr[i][j] = Math.min(arr[i-1][j]+(int)s1.charAt(i-1),arr[i][j-1]+(int)s2.charAt(j-1));
                }
            }
        }
        return arr[m][n];
    }
}