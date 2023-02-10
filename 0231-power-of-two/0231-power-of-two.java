class Solution {
    public boolean isPowerOfTwo(int n) {
        return ispow(n,0);
    }
    public boolean ispow(int n,int i){
        double a=Math.pow(2,i);
        if(a==n){return true;}
        if(a>n){return false;}
        return ispow(n,++i);
    }
}