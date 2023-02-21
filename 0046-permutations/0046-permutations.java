class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        helper(nums,0,l);
        return l;
    }
    public void helper(int[] arr,int ind,List<List<Integer>> l){
        if(ind==arr.length-1){
            ArrayList<Integer> array_list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++)
                array_list.add(new Integer(arr[i]));
            l.add(array_list);
        }
        for(int i=ind;i<arr.length;i++){
            arr=swap(arr,i,ind);
            helper(arr,ind+1,l);
            arr=swap(arr,i,ind);
        }
    }
    public int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    } 
}