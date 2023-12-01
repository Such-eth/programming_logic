class Solution {
    List<List<Integer>> permutations;
    
    public List<List<Integer>> permute(int[] nums) {
        permutations = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findPermutations(nums,list);
        return permutations;
    }
    
    public void findPermutations(int[] nums, List<Integer> list){
        if(list.size()==nums.length)
            permutations.add(new ArrayList<>(list));
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            findPermutations(nums,list);
            list.remove(list.size()-1);
        }
    }
    
}