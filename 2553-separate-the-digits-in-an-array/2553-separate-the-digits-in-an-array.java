class Solution {
    public int[] separateDigits(int[] nums) {
        String a="";
        for (int j : nums) {
            a += String.valueOf(j);
        }
        int[] ans = new int[a.length()];
        for(int i=0;i<a.length();i++){
            ans[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return ans;
    }
}