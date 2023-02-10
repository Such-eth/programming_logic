class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s,int start,int end){
        if(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
        }else{
            System.out.println(Arrays.toString(s));
            return;
            }
        reverse(s,start+1,end-1);
    }
}