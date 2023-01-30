class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(mid%2==0&&mid!=nums.length-1&& nums[mid+1]==nums[mid] || mid%2!=0&&mid!=0&& nums[mid-1]==nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return nums[start];
    }
}