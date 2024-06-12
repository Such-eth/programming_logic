class Solution {
    public String findLatestTime(String s) {
        int n=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                if(i==0){
                    if(s.charAt(1)<'2' || s.charAt(1)=='?') s="1"+s.substring(1,n);
                    else s="0"+s.substring(1,n);
                }
                else if(i==1){
                    if(s.charAt(0)=='1') s="11"+s.substring(2,n);
                    else s="09"+s.substring(2,n);
                }else if(i==3) s=s.substring(0,3)+"5"+s.substring(4,n);
                else s=s.substring(0,4)+"9";
            }
        }
        return s;
    }
}