class Solution {
    public long minEnd(int n, int x) {
        long a=x;
        for(int i=1;i<n;i++){
            a = (a+1)|x;
            // System.out.println(x);
        }
        return a;
    }
}