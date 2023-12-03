class Solution {
    List<List<Integer>> combinations;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinations = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findCombinations(candidates,target,list,0);
        return combinations;
    }
    public void findCombinations(int[] arr, int target, List<Integer> list, int index){
        if(target==0){
            combinations.add(new ArrayList<>(list));
            return;
        }
        if(index>=arr.length || target<0)
            return;
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])
                continue;
            if(target-arr[i]<0)
                break;
            list.add(arr[i]);
            findCombinations(arr,target-arr[i],list,i+1);
            list.remove(list.size()-1);
        }   
    }
}