class Solution {
    public int specialArray(int[] nums) {
        int end=nums.length;
        int start=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=mid) count++;
            }
            if(count==mid) 
            return mid;
            if(count>mid)
            start=mid+1;
            else
            end=mid-1;
        }
        return -1;
    }
}