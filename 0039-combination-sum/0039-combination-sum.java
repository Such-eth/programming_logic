class Solution {    
    List<List<Integer>> combinations;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        combinations = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates,target,0,list);
        return combinations;
    }
    public void findCombinations(int[] arr, int target,int index,List<Integer> list){
        if(target==0){
            combinations.add(new ArrayList<>(list));
            return;
        }        
        if(index>=arr.length)
            return;
        if(arr[index]<=target){
            list.add(arr[index]);
            findCombinations(arr,target-arr[index],index,list);
            list.remove(list.size()-1);
        }
        findCombinations(arr,target,index+1,list);
    }
}