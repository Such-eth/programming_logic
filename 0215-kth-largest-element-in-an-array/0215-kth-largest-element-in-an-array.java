class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int i:nums)
            q.add(i);
        int ans=-1;
        for(int i=0;i<k;i++)
            ans = q.remove();
        return ans;        
    }
}