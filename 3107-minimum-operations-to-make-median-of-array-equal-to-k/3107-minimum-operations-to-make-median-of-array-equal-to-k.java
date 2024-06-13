class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        int ind = nums.length/2;
        if(nums[ind]<k){
            int i=ind;
            long count=0;
            while(i<nums.length && nums[i]<=k)
                count+=k-nums[i++];
            return count;
        }else if(nums[ind]>k){
            int i=ind;
            long count=0;
            while(i>=0 && nums[i]>=k)
                count+=nums[i--]-k;
            // System.out.println(nums[ind]+" "+count);
            return count;
        }
        return 0;
    }
}