class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int l = i+1;
            int r = nums.length-1;
            while(l<nums.length && l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    ans.add(new ArrayList<>(li));
                    l++;
                    while(l<nums.length-1 && l<r && nums[l]==nums[l-1])
                        l++;
                }
                else if(nums[i]+nums[l]+nums[r]<0)
                    l++;
                else r--;
            }
        }
        return ans;
    }
}