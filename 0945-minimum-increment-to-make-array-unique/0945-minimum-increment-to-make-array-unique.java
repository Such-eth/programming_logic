class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=arr[i-1]){
                arr[i] = arr[i-1]+1;
                count+=arr[i]-nums[i];
            }else{
                arr[i]=nums[i];
            }
        }
        return count;
    }
    // 1 1 2 2 3 7 a1
    // 1 2 3 4 5 7 a2
}