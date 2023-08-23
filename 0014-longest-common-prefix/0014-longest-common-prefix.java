class Solution {
    //  public String longestCommonPrefix(String[] strs) {
    //     if (strs.length == 0) return "";
    //     String prefix = strs[0];
    //     for (int i = 1; i < strs.length; i++)
    //         while (strs[i].indexOf(prefix) != 0) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if (prefix.isEmpty()) return "";
    //         }        
    //     return prefix;
    // }
    
    public String longestCommonPrefix(String[] strs){
        String ans="";
        for(int i=0;i<strs[0].length();i++){
            char check = strs[0].charAt(i);
            int j;
            for(j=1;j<strs.length && i<strs[j].length();j++){
                if(strs[j].charAt(i)!=check)
                    break;
            }
            if(j==strs.length)
                ans+=String.valueOf(check);
            else
                return ans;
        }
        return ans;
    }
}