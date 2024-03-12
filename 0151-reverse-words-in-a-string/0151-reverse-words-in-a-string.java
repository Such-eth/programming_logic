class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        String str = "";
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("")){
                str+=arr[i].trim()+" ";
            }       
        }
        return str.trim();
    }
}