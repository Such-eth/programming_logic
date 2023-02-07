class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){return strs[0];}
        String ans="";
        int j=0;
        while(j<strs[0].length() && j<strs[1].length() && strs[0].charAt(j)==strs[1].charAt(j)){
            ans+=strs[0].charAt(j);
            j++;
        }
        if(strs.length==2){return ans;}
        for(int i=2;i<strs.length;i++){
            if(ans.length()==0){return ans;}
            if(strs[i].startsWith(ans)){
                continue;
            }else{
                    while(ans.length()>=0 && !strs[i].startsWith(ans)){
                        ans=ans.substring(0,ans.length()-1);
                    }
            }
        }
        return ans;
    }
}