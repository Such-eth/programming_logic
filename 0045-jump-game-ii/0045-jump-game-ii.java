class Solution {
    int[] dp;
    public int jump(int[] nums) {
        dp = new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int x= mini(nums,0);
        // System.out.println(Arrays.toString(dp));
        return x;
    }
    public int mini(int[] arr,int i){
        if(i>=arr.length-1)
            return 0;
        if(dp[i]>-1)
            return dp[i];
        int c=9999;
        for(int j=1;j<=arr[i];j++){
            c=Math.min(c,mini(arr,i+j)+1);
        }
        System.out.println(c);
        dp[i]=c;
        return c;
    }
}