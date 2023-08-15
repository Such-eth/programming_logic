class Solution {
    // public int[][] dp;
    public int lengthOfLIS(int[] nums) {
        // dp = new int[nums.length][nums.length];
        // for(int[] i:dp)
        //     Arrays.fill(i,-1);
        return find(nums);
    }
    
    // public int find_size(int[] arr,int i,int j){
    //     if(i==arr.length)
    //         return 0;        
    //     if(dp[i][j+1]>-1)
    //         return dp[i][j];
    //     if(j==-1 || arr[j]<arr[i])
    //         return dp[i][j+1]=Math.max(1+find_size(arr,i+1,i),find_size(arr,i+1,j));
    //     return dp[i][j+1]=find_size(arr,i+1,j);
    // }
    
    public int find(int[] arr){
        int m=arr.length;
        int[][] dp = new int[m+1][m+1];
        for(int i=m-1;i>=0;i--){
            for(int j=i-1;j>=-1;j--){
                if(j==-1 || arr[j]<arr[i])
                    dp[i][j+1]=Math.max(1+dp[i+1][i+1],dp[i+1][j+1]);
                else
                    dp[i][j+1]=dp[i+1][j+1];
            }
        }
        return dp[0][0];
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