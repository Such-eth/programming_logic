class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry=0;
        int n1=a.length(),n2=b.length();
        int n=Math.max(n1,n2);
        for(int i=0;i<n;i++){
            int p=0,q=0;
            if(i<n1){
                p=a.charAt(n1-1-i)-'0';
            }
            if(i<n2){
                q=b.charAt(n2-1-i)-'0';
            }
            int temp=carry+p+q;
            ans=temp%2+ans;
            carry=temp/2;
        }
        if(carry!=0){
            return "1"+ans;
        }
        return ans;
    }
}