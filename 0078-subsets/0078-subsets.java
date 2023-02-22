class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        helper(nums,0,l1);
        return l;
    }
    public void helper(int[] arr,int i,List<Integer> list){
        if(i==arr.length){
            l.add(new ArrayList(list));
            return;
        }
        list.add(arr[i]);
        helper(arr,i+1,list);
        list.remove(list.size()-1);
        helper(arr,i+1,list);
    }
}