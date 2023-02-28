class Solution {
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> l1 = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,l1,target);
        return l;
    }
    public void helper(int ind,int[] arr,List<Integer> list,int target){
        if(ind==arr.length){
            if(target==0){
                l.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            list.add(arr[ind]);
            helper(ind,arr,list,target-arr[ind]);
            list.remove(list.size()-1);
        }
        helper(++ind,arr,list,target);
    }
}