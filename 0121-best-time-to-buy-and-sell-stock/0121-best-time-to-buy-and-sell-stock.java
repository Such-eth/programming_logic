class Solution {
    int count=0;
    public int maxProfit(int[] arr) {
        int min=arr[0];
        int max_pr=0;
        for(int i=1;i<arr.length;i++){
            int profit=arr[i]-min;
            max_pr=Math.max(max_pr,profit);
            min=Math.min(min,arr[i]);
        }
        return max_pr;
    }
}