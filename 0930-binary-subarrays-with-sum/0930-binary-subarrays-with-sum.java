class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int prefixSum=0;
            for(int j=i;j<nums.length;j++){
                prefixSum+=nums[j];
                if(prefixSum==goal)
                    sum++;
            }
        }
        return sum;
    }
}