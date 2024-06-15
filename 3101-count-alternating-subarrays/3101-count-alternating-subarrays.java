class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int i=0,j=1;
        long total=0;
        while(i<nums.length){
            while(j<nums.length && nums[j]!=nums[j-1]){
                j++;
            }
            total+=sum(j-i);
            i=j;
            j++;
        }
        return total;
    }
    public long sum(int n){
        long num;
        if(n%2==0){
            num = n/2;
            return (long)num*(n+1);
        }
        num = (n+1)/2;
        return (long)num*n;
    }
}