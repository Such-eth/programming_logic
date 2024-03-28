class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        left[0]=height[0];
        int[] right = new int[n];
        right[n-1] = height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
            right[n-i-1] = Math.max(right[n-i],height[n-i-1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int val=Math.min(left[i],right[i])-height[i];
            if(val<0) val=0;
            ans+=val;
        }
        return ans;
    }
}