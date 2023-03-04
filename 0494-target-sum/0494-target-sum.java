class Solution {
    static int count=0;
    public static int findTargetSumWays(int[] nums, int target) {
        count=0;
        helper(nums,0,target);
        return count;
    }

    private static void helper(int[] nums, int ind, int target) {
        if(ind== nums.length){
            if(target==0)
                count++;
            return;
        }
        helper(nums,ind+1,target-nums[ind]);
        helper(nums,ind+1,target+nums[ind]);
    }
}
