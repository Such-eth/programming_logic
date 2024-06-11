class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0;
        int n = nums1.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // for(int i=0;i<n;i++)
        //     sum1+=nums1[i];
        // for(int i=0;i<nums2.length;i++)
        //     sum2+=nums2[i];
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int l=0,k=0;
                Integer diff = null;
                for(k=0;k<n;k++){
                    // System.out.println(i+" "+j+" "+k);
                    if(k==i || k==j)
                        continue;
                    // System.out.println(i+" "+j+" "+k+" "+diff);
                    if(diff==null){
                        diff=nums2[l++]-nums1[k];
                    }
                    else if(nums2[l++]-nums1[k]!=diff)
                        break;
                }
                if(k==n)
                    ans = Math.min(ans,diff);
            }
        }
        return ans;
    }
}