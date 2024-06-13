class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int i=0,j=1;
        while(i<nums.length && j<nums.length){
            while(j<nums.length && nums[j-1]<nums[j])
                j++;
            max = Math.max(max,j-i);
            i=j;
            j=i+1;
        }
        i=0;
        j=1;
        while(i<nums.length && j<nums.length){
            while(j<nums.length && nums[j-1]>nums[j])
                j++;
            max = Math.max(max,j-i);
            i=j;
            j=i+1;
        }
        return max;
    }
}