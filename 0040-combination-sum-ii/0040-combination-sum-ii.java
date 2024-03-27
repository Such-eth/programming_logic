class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        find(candidates,l,target,0);
        return ans;
    }
    public void find(int[] arr,List<Integer> l,int tar,int ind){
        if(tar==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(tar<0 || ind==arr.length)
            return;
        for(int i=ind;i<arr.length;i++){
            if(i==ind || arr[i]!=arr[i-1]){
                if(tar-arr[i]>=0){
                    l.add(arr[i]);
                    find(arr,l,tar-arr[i],i+1);
                    l.remove(l.size()-1);
                }else break;
            }
        }
    }
}