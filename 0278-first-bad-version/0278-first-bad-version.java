/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start =1;
        int end =n;
        int ans = n;
        while(start<=end){
            int mid = start-(start-end)/2;
            if(isBadVersion(mid)){
                ans = mid;
                end=mid-1;
            }else start = mid+1;
        }
        return ans;
    }
}