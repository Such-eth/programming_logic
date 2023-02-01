class Solution {
    public boolean isPerfectSquare(int num) {
        long start=0;
        long end = num;
        while(start<=end){
            long mid=start-(start-end)/2;
            if(mid*mid>num){
                end=mid-1;
            }else if(mid*mid<num){
                start=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}