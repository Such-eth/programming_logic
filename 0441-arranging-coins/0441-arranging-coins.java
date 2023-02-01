class Solution {
    public int arrangeCoins(int n) {
        int i=0,sum=0;
        while(n>0){
            sum+=1;
            n-=sum;
            i++;
        }
        if(n==0){
            return i;
        }
        return i-1;
    }
}