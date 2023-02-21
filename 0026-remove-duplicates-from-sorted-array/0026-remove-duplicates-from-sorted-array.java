class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int j=i;
            while(j<nums.length && nums[j]==nums[i]){
                j++;
            }
            j--;
            nums[count]=nums[j];
            count++;
            i=j;
        }
        return count;
    }
}