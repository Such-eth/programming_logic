class Solution {
    List<List<Integer>> subsets;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        findSubsets(nums,0,list,-11);
        return subsets;
    }
    public void findSubsets(int[] arr,int index,List<Integer> list,int prev){
        if(index==arr.length){
            subsets.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        findSubsets(arr,index+1,list,arr[index]);
        list.remove(list.size()-1);
        if(prev!=arr[index])
            findSubsets(arr,index+1,list,prev);
    }
}