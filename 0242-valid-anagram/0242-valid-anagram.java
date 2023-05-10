class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'0'-49;
            arr[x]++;
        }
        for(int i=0;i<t.length();i++){
            int x=t.charAt(i)-'0'-49;
            arr[x]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}