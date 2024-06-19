class Solution {
    public boolean isSubstringPresent(String s) {
        HashSet<String> set = new HashSet<>();
        for(int i=1;i<s.length();i++){
            String s1 = String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i-1));
            set.add(s1);
        }
        // System.out.println(set);
        for(int i=s.length()-1;i>=1;i--){
            String s1 = String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i));
            if(set.contains(s1))
                return true;
        }
        return false;
    }
}