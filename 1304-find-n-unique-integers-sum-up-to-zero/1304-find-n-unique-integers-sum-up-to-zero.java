class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2!=0){
            int num=n/2;
            for(int i=n-1;i>=0;i--){
                ans[i]=num;
                num--;
            }
        }else{
            int num=n/2;
            for(int i=n-1;i>=0;i--){
                if(num==0){num--;}
                ans[i]=num;
                num--;
            }
        }
        return ans;
    }
}