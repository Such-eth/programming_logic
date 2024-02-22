class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ind = n-Math.abs(nums[i])-1;
            if(nums[ind]<0)
                return Math.abs(nums[i]);
            nums[ind]=-nums[ind];
        }
        return -1;
    }
}