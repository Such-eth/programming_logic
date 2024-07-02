class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arr = new int[nums.length+1];
        int max = 0;
        for(int i:nums){
            arr[i]++;
            max = Math.max(max,arr[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<max;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                if(arr[j]>0){
                    list.add(j);
                    arr[j]--;
                }
            }
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
    
}