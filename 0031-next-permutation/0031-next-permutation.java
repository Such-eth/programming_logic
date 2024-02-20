class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int pivot=-1;
        for(int ind = size-1;ind>=1;ind--){
            if(nums[ind]>nums[ind-1]){
                pivot=ind-1;
                break;
            }                
        }
        if(pivot==-1)
            reverseFromPivot(nums,-1);
        else{
            int swapInd = size-1;
            for(int i=size-1;size>pivot;i--){
                if(nums[i]>nums[pivot]){
                    swapInd=i;
                    break;
                }
                    
            }
            swapPivot(nums,pivot,swapInd);
            reverseFromPivot(nums,pivot);
        }
    }
    public void reverseFromPivot(int[] nums, int pivot){
        int start=pivot+1;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void swapPivot(int[] nums,int pivot,int ind){
        int temp = nums[pivot];
        nums[pivot]= nums[ind];
        nums[ind]=temp;
    }
}