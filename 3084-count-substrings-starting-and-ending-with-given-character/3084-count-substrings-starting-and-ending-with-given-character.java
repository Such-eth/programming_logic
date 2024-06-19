class Solution {
    public long countSubstrings(String s, char c) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                count++;
        }
        long ans=0;
        if(count%2==0){
            long num = count/2;
            ans = num*(count+1);
            return ans;
        }
        long num = (count+1)/2;
        ans = num*(count);
        return ans;
    }
}