class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int even = find(s,i,i+1);
            int odd = 1+find(s,i-1,i+1);
            count+=even+odd;
        }
        return count;
    }
    public int find(String s,int i,int j){
        int n = s.length();
        int count=0;
        while(i>=0 && j<n && s.charAt(i--)==s.charAt(j++))
            count++;
        return count;
    }
}