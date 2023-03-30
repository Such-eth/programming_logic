class Solution {
    public void rotate(int[] nums, int k) {
        int start_ind=nums.length-k%nums.length;
        int[] ans= new int[nums.length];
        int ind=0;
        for(int i=start_ind;i<nums.length;i++){
            ans[ind++]=nums[i];
        }
        for(int i=0;i<start_ind;i++){
            ans[ind++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}