class Solution {
    public int totalMoney(int n) {
        int weeks = n/7;
        int days = n%7;
        int total=0;
        int i;
        for(i=1;i<=weeks;i++){
            total+=7*i+21;
        }
        for(int j=0;j<days;j++){
            total+=i++;
        }
        return total;
    }
}