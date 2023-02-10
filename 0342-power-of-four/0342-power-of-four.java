class Solution {
    public boolean isPowerOfFour(int n) {
        return ispow(n,0);
    }
    public boolean ispow(int n,int i){
        double a=Math.pow(4,i);
        if(a==n){return true;}
        if(a>n){return false;}
        return ispow(n,++i);
    }
}