class Solution {
    public int romanToInt(String s) {
        if(s.equals("")) return 0;
        int first = toInt(s.charAt(s.length()-1));
        int val=first;
        int i=s.length()-2;
        while(i>=0 && toInt(s.charAt(i))==first){
            val+=toInt(s.charAt(i));
            i--;
        }
        if(i>=0 && toInt(s.charAt(i))<first){
            val-=toInt(s.charAt(i));
            i--;
        }
        return val+romanToInt(s.substring(0,i+1));        
    }
    public int toInt(char c){
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        return 1000;
    }
}