class Solution {
    List<List<Integer>> combinations;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinations = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        findCombinations(candidates,current,target,0);
        return combinations;
    }
    public void findCombinations(int[] candidates,List<Integer> current,int target,int index){
        if(target==0){
            combinations.add(new ArrayList<>(current));
            return;
        }
        if(index>=candidates.length || target<0)
            return;
        if(candidates[index]<=target){
            current.add(candidates[index]);
            findCombinations(candidates,current,target-candidates[index],index);
            current.remove(current.size()-1);
            // findCombinations(candidates,current,target,index);
        }
        findCombinations(candidates,current,target,index+1);
    }
}