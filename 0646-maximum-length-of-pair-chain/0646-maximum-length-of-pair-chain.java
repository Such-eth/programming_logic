class Solution {
    public int findLongestChain(int[][] pairs) {
        Comparator<int[]> customComparator = new Comparator<int[]>() {
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[1], row2[1]);
            }
        };
        Arrays.sort(pairs, customComparator);
        int prev=pairs[0][1];
        int ans=1;
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>prev){
                ans++;
                prev=pairs[i][1];
            }
        }
        return ans;
    }
}