class Solution {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder();
        int i=0;
        while(i<word.length()){
            char ch = word.charAt(i);
            int j=i;
            while(j<word.length() && word.charAt(j)==ch && j-i<9){
                j++;
            }
            String s = String.valueOf(j-i)+ch;
            str.append(s);
            if(j!=i+1)
                i=j;
            else i++;
        }
        return str.toString();
    }
}