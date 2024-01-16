class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int temp = nums[0];
        nums[0]=0;
        int a = find(nums);
        nums[0]=temp;nums[nums.length-1]=0;
        int b = find(nums);
        return Math.max(a,b);
    }
    public int find(int[] arr){
        int[] dp = new int[arr.length+2];
        for(int ind=arr.length-1;ind>=0;ind--){
            int take = dp[ind+2]+arr[ind];
            int notTake = dp[ind+1];
            dp[ind]=Math.max(take,notTake);
        }
        return dp[0];
    }
}