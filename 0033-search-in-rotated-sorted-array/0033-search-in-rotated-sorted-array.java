class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int pivot=-1;
        while(start<=end){
            int mid = start-(start-end)/2;
            if(mid!=nums.length-1 && nums[mid]>nums[mid+1]){
                pivot=mid;
                break;
            }
            if(nums[mid]>=nums[0])
                start=mid+1;
            else end=mid-1;
        }
        System.out.println(pivot);
        int ans=binarySearch(nums,0,pivot,target);
        if(ans!=-1)
            return ans;
        return binarySearch(nums,pivot+1,nums.length-1,target);
    }
    public int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid = start-(start-end)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
}