class Solution {
    List<String> l = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        l = new ArrayList<>();
        if(digits.equals("")){return l;}
        helper("",digits);
        return l;
    }
    public void helper(String p,String up){
        if(up.isEmpty()){
            l.add(p);
            return;
        }
        int num=up.charAt(0)-'0';
        String str=convert(num);
        for(int i=0;i<str.length();i++){
            helper(p+str.charAt(i),up.substring(1));
        }
    }
    public String convert(int a){
        if(a==2){return "abc";}
        if(a==3){return "def";}
        if(a==4){return "ghi";}
        if(a==5){return "jkl";}
        if(a==6){return "mno";}
        if(a==7){return "pqrs";}
        if(a==8){return "tuv";}
        if(a==9){return "wxyz";}
        return null;
    }
}