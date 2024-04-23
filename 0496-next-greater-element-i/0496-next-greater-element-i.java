class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n1 = nums1.length,n2=nums2.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],i);
        }
        st.push(nums2[0]);
        int[] ans = new int[n1];
        Arrays.fill(ans,-1);
        for(int i=1;i<n2;i++){
            if(nums2[i]<st.peek())
                st.push(nums2[i]);
            else{
                while(!st.isEmpty() && nums2[i]>st.peek()){
                    int num = st.pop();
                    if(map.containsKey(num))
                        ans[map.get(num)]=nums2[i];
                }
                st.push(nums2[i]);
            }
        }
        return ans;
    }
}