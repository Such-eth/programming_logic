class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] ans = new int[k];
        List<Integer>[] list = new List[n+1];
        for(int key:map.keySet()){
            if(list[map.get(key)]==null)
                list[map.get(key)] = new ArrayList<>();
            list[map.get(key)].add(key);
        }
        int l=0;
        for(int i=n;i>=0 && l<ans.length;i--){
            for(int j=0;list[i]!=null && j<list[i].size() && l<ans.length;j++){
                ans[l++] = list[i].get(j);
            }
        }
        // System.out.println(map);
        return ans;
    }
}