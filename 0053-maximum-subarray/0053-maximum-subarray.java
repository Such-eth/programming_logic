class Solution {
    public int maxSubArray(int[] nums) {
        int globalSum=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            globalSum = Math.max(sum,globalSum);
            if(sum<0)
                sum=0;            
        }
        return globalSum;
    }
}