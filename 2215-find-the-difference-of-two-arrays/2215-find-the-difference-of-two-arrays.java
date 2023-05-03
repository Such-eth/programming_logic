class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        l1=uniqueEle(nums1,nums2);
        l2=uniqueEle(nums2,nums1);
        return Arrays.asList(l1,l2);
    }
    public List<Integer> uniqueEle(int[] nums1,int[] nums2){
        HashSet<Integer> set1 = new HashSet();
        HashSet<Integer> set2 = new HashSet();
        List<Integer> l = new ArrayList();
        for(int num:nums2){
            set1.add(num);
        }
        for(int num:nums1){
            if(!set1.contains(num)){
                set2.add(num);
            }
        }
        return new ArrayList<>(set2);
    }
}