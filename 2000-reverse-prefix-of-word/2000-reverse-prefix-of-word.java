class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        while(i<word.length() && word.charAt(i)!=ch){
            i++;
        }
        if(i==word.length()){
            return word;
        }
        String half=word.substring(i+1);
        String ans="";
        while(i>=0){
            ans+=word.charAt(i);
            i--;
        }
        ans+=half;
        return ans;
    }
}