class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n>0 && (n&n-1)==0)
            return true;
        return false;
        // return ispow(n,0);
    }
    public boolean ispow(int n,int i){
        double a=Math.pow(2,i);
        if(a==n){return true;}
        if(a>n){return false;}
        return ispow(n,++i);
    }
}