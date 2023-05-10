class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<List<String>>();
        for(int i=0;i<strs.length;i++){
            if(strs[i]!="0"){
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                for(int j=0;j<strs.length;j++){
                    if(strs[j]!="0" && i!=j && isAnagram(strs[i],strs[j])){
                        l.add(strs[j]);
                        strs[j]="0";
                    }
                }
                ans.add(l);
            }
        }
        return ans;
    }
    
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