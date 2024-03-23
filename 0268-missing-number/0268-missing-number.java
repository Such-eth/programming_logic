class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x1 = 0,x2=0;
        for(int i=0;i<n;i++){
            x2^=nums[i];
            x1^=i;
        }
        x1^=n;
        return x1^x2;
    }
}