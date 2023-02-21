class Solution {
    public String addSpaces(String s, int[] n) {
        // return helper(s,spaces,0);
        // String ans="";
        // int j=0,k=0;
        // int a=(s.length()+spaces.length);
        // for(int i=0;i<a;i++){
        //     if(j>=spaces.length || i != spaces[j]+j){
        //         ans+=s.charAt(k);
        //         k++;
        //     }else{
        //         ans+=" ";
        //         j++;
        //     }
        // }
        // return ans;
        char c [] = new char [s.length()+n.length];  
         int res=0;
         for (int i :n) c[i+res++]=' ';
         for (int i=0 ,j=0;i<c.length;i++) 
            if(c[i]!=' ')
                c[i]=s.charAt(j++);
         return new String(c);
    }
    // public String helper(String s,int[] arr,int i){
    //     if(i==arr.length){return s;}
    //     String a=s.substring(0,i+arr[i]);
    //     String b=s.substring(i+arr[i]);
    //     s=a+" "+b;
    //     return helper(s,arr,i+1);
    // }
}