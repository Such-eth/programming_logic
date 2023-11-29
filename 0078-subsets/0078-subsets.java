class Solution {
    List<List<Integer>> subsets;
    public List<List<Integer>> subsets(int[] nums) {
        subsets = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findSubsets(nums,curr,0);
        return subsets;
    }
    public void findSubsets(int[] arr, List<Integer> curr,int i){
        if(i==arr.length){
            subsets.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[i]);
        findSubsets(arr,curr,i+1);
        curr.remove(curr.size()-1);
        findSubsets(arr,curr,i+1);
    }
}