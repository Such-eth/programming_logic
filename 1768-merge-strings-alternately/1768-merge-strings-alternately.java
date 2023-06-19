class Solution {
    public String mergeAlternately(String w1, String w2) {
        int i=0,j=0,k=0;
        String ans="";
        while(i<w1.length() && j<w2.length()){
            if(k%2==0)
                ans+=w1.charAt(i++);
            else
                ans+=w2.charAt(j++);
            k++;
        }
        while(i<w1.length()){
            ans+=w1.charAt(i++);
        }
        while(j<w2.length()){
            ans+=w2.charAt(j++);
        }
        return ans;
    }
}