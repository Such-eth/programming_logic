class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(exp);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(exp[i]!=heights[i])
                ans++;
        }
        return ans;
    }
}