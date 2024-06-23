class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double max = Integer.MAX_VALUE;
        for(int i=0;i<nums.length/2;i++){
            double num = (nums[i]+nums[nums.length-1-i])/(double)2;
            // System.out.println(nums[i]+" "+nums[nums.length-1-i]);
            max = Math.min(num,max);
        }
        return max;
    }
}