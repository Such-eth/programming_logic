class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=pro;
            pro*=nums[i];
        }
        pro=1;
        for(int i=ans.length-1;i>=0;i--){
            ans[i]*=pro;
            pro*=nums[i];
        }
        return ans;
    }
}