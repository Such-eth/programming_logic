class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> lis = new ArrayList();
        lis.add(1);
        ans.add(lis);
        for(int i=1;i<numRows;i++){
            List<Integer> l = new ArrayList();
            l.add(1);
            for(int j=1;j<i;j++){
                l.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            l.add(1);
            ans.add(l);
        }
        System.out.println(ans);
        return ans;
    }
}