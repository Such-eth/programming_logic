class Solution {
    public int[] plusOne(int[] digits) {
        int check=0;
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){check++;}
        }
        int size=0;
        if(check==digits.length){
            size=digits.length+1;
            int[] ans = new int[size];
            ans[0]=1;
            for(int i=1;i<ans.length;i++){
                ans[i]=0;
            }
            return ans;
        }else{
            size=digits.length;
        }
        int carry=0;
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]+=carry;
            if(digits[i]>9){
                digits[i]%=10;
                carry=1;
            }else{
                carry=0;
            }
        }
        return digits;
    }
}