class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> l=new ArrayList();
        ArrayList<Integer> l2=new ArrayList();
        for(int i=1;i<=nums.length;i++){
            l.add(i);
        }
        for(int i=0;i<nums.length;i++){
            l.set(nums[i]-1,0);
        }
        for(int i=0;i<nums.length;i++){
            if(l.get(i)!=0){
                l2.add(l.get(i));
            }
        }
        return l2;

    }
}