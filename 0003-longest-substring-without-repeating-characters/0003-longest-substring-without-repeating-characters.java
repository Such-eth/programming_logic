class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int max = 0;
        Set<Character> set = new HashSet<>();
        int i=0,j=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                while(j<s.length() && set.contains(ch)){
                    set.remove(s.charAt(j));
                    j++;
                }
            }
            set.add(ch);
            i++;
            max = Math.max(max,set.size());
        }
        return max;
    }
}

