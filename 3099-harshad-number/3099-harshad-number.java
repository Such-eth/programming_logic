class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy = x, sum = 0;
        while(copy>0){
            sum+=copy%10;
            copy=copy/10;
        }
        // System.out.println(sum);
        if(x%sum==0) return sum;
        return -1;
    }
}