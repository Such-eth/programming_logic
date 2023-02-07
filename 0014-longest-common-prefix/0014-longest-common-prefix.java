class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){return strs[0];}
        String ans="";
        for(int j=0;j<strs[0].length();j++){
            int count=0;
            for(int i=1;i<strs.length;i++){
                if(j>strs[i].length()-1){return ans;}
                if(strs[i].charAt(j)==strs[0].charAt(j)){
                    count++;
                }
            }
            if(count == strs.length-1){ans+=strs[0].charAt(j);}
            else{return ans;}
        }
        return ans;
    }
}