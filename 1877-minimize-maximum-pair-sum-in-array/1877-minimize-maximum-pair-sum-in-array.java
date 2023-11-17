class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<(nums.length/2);i++){
            int currentSum = nums[i]+nums[nums.length-i-1];
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}