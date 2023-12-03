class Solution {
    Set<List<Integer>> subsets;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subsets = new HashSet<>();
        List<Integer> subset = new ArrayList<>();
        findSubsets(nums,subset,0);
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> list:subsets)
            ans.add(list);
        return ans;
    }
    public void findSubsets(int[] nums,List<Integer> subset, int index){
        if(index>=nums.length){
            subsets.add(new ArrayList<>(subset));
            return;
        }
        int current = nums[index++];
        subset.add(current);
        // while(index<nums.length && nums[index]==current)
        //     index++;
        findSubsets(nums,subset,index);
        subset.remove(subset.size()-1);
        findSubsets(nums,subset,index);
    }
}