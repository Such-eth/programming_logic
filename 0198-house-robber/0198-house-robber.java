class Solution {
    // int[] dp;
    public int rob(int[] nums) {
        // dp = new int[nums.length];
        return find(nums);
    }
    // public int find(int[] arr,int ind,int sum){
    //     if(ind>=arr.length){
    //         return sum;
    //     }
    //     int take = find(arr,ind+2,sum+arr[ind]);
    //     int notTake = find(arr,ind+1,sum);
    //     return Math.max(take,notTake);
    // }
    // public int find(int[] arr,int ind){
    //     if(ind>=arr.length)
    //         return 0;
    //     if(dp[ind]>0)
    //         return dp[ind];
    //     int take = find(arr,ind+2)+arr[ind];
    //     int notTake = find(arr,ind+1);
    //     return dp[ind]=Math.max(take,notTake);
    // }
    public int find(int[] arr){
        int[] dp = new int[arr.length+2];
        for(int ind=arr.length-1;ind>=0;ind--){
            int take = dp[ind+2]+arr[ind];
            int notTake = dp[ind+1];
            dp[ind]=Math.max(take,notTake);
        }
        return dp[0];
    }
    // public int find(int[] arr){
    //     int n1=0,n2=0,curr=0;
    //     for(int ind=arr.length-1;ind>=0;ind--){
    //         int take = n2+arr[ind];
    //         int notTake = n1;
    //         curr=Math.max(take,notTake);
    //         // curr = dp[ind];
    //         n1=curr;
    //         n2=n1;
    //     }
    //     return curr;
    // }
}