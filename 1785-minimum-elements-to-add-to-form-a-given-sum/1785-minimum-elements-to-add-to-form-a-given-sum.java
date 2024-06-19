class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum=0;
        for(int i:nums)
            sum+=i;
        long num = goal-sum;
        System.out.println(num+" "+sum);
        // if(num<0){
        //     return Math.abs(num)/limit;
        // }
        return (int)Math.ceil(Math.abs(num)/(double)limit);
    }
}
// 1 2 3    3  25
// 6 
// 19->3+3+3+3+3+3+1
// 20->18+2