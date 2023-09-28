class Solution {
    public int minPartitions(String n) {
        String[] arr = n.split("");
        int ans=Integer.MIN_VALUE;
        for(String s:arr)
            ans=Math.max(ans,Integer.parseInt(s));
        return ans;
    }
}