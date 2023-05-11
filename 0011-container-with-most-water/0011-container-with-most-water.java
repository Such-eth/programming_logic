class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int left=0,right=height.length-1;
        while(left<right){
            ans=Math.max(ans,Math.min(height[left],height[right])*(right-left));
            if(height[left]>=height[right]){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}