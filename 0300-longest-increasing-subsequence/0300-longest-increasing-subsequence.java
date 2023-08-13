class Solution {
    public int[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return find_size(nums,0,-1);
    }
    
    public int find_size(int[] arr,int i,int j){
        if(i==arr.length)
            return 0;        
        if(j==-1)
            return Math.max(1+find_size(arr,i+1,i),find_size(arr,i+1,j));
        if(dp[i][j]>-1)
            return dp[i][j];
        if(arr[j]<arr[i])
            return dp[i][j]=Math.max(1+find_size(arr,i+1,i),find_size(arr,i+1,j));
        return dp[i][j]=find_size(arr,i+1,j);
    }
    
//     public static int binaary_search(int arr,int num){
//         int start = 0;
//         int end = num.length-1;
//         int mid = start-(start-end)/2;
//         int ans=0;
//         if(arr[mid]==num)
//             return mid;
//         if(arr[mid]<num){
            
//         }else{
            
//         }
//     }
}