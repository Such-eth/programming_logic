class Solution {
    public boolean isPowerOfThree(int n) {
        return ispow(n,0);
    }
    public boolean ispow(int n,int i){
        double a=Math.pow(3,i);
        if(a==n){return true;}
        if(a>n){return false;}
        return ispow(n,++i);
    }
}