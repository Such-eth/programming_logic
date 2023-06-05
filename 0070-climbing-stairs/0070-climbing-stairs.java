class Solution {
    static int[] arr;
    public static int climbStairs(int n) {
//         if(n==1) return 1;
        
//         if(n==2) return 2;

//         int[] a =  new int[n];
//         a[0]=1;
//         a[1]=2;

//         for(int i=2;i<n;i++){
//             a[i]=a[i-1]+a[i-2];
//         }
//         return a[n-1];
        arr=new int[n];
        return helper(n);
    }
    public static int helper(int n){
        if(n==0)
            return 1;
        if(n<0)
            return 0;
        if(arr[n-1]>0)
            return arr[n-1];
        arr[n-1]=helper(n-1)+helper(n-2);
        return helper(n-1)+helper(n-2);
    }
}