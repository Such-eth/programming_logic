class Solution {
    List<List<String>> palendromes;
    public List<List<String>> partition(String s) {
        palendromes = new ArrayList<>();
        List<String> list = new ArrayList<>();
        findPalendromes(s,list);
        return palendromes;
    }
    public void findPalendromes(String s,List<String> list){
        if(s.length()==0){
            palendromes.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=s.length();i++){
            if(isPalendrome(s.substring(0,i))){
                list.add(s.substring(0,i));
                findPalendromes(s.substring(i),list);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalendrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}