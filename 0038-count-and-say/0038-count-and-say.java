class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        return say(countAndSay(n-1));
    }
    public String say(String s){
        String ans = "";
        int n = s.length();
        int i=0;
        while(i<n){
            char c = s.charAt(i);
            int j=i;
            while(j<n && s.charAt(i)==s.charAt(j))
                j++;
            ans+=j-i+""+c;
            i=j;
        }
        return ans;
    }
}