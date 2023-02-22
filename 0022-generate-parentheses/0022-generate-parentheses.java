class Solution {
    List<String> l = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        l = new ArrayList<String>();
        helper(n,"",0,0,l);
        return l;
    }
    public void helper(int n,String s,int o,int c,List<String> l){
        if(o==n && c==n){
            l.add(s);
            return;
        }
        //for open
        if(o<n){
            helper(n,s+'(',o+1,c,l);
        }
        //for closed
        if(c<o){
            helper(n,s+')',o,c+1,l);
        }
    }
}