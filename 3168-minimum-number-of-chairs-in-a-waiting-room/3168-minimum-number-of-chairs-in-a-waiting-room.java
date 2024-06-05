class Solution {
    public int minimumChairs(String s) {
        Stack<Integer> st = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='E')
               st.push(0);
           else st.pop();
           max = Math.max(max,st.size()); 
        }
        return max;
    }
}