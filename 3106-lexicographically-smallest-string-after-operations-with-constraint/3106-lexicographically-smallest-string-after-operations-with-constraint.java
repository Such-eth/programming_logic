class Solution {
    public String getSmallestString(String s, int k) {
        for(int i=0;i<s.length()&&k>0;i++){
            for(char ch = 'a';ch<='z';ch++){
                String s1 = replaceChar(s,ch,i);
                int dist = distance(s,s1);
                if(dist<=k){
                    s = s1;
                    k-= dist;
                    break;
                }
            }
        }
        return s;
    }
    public String replaceChar(String s,char ch, int ind){
        String ans = s.substring(0,ind)+String.valueOf(ch);
        if(ind!=s.length()-1)
            ans = ans+s.substring(ind+1,s.length());
        return ans;
    } 
    public int distance(String s1, String s2){
        int max = 0;
        for(int i=0;i<s1.length();i++){
            int diff = Math.abs(s1.charAt(i)-s2.charAt(i));
            max+=Math.min(diff,26-diff);
        }
        return max;
    }
}