class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int start=1,end=piles[n-1];
        int ans=end;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(check(piles,h,mid)){
                ans = mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
    public boolean check(int[] arr,int h,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k)
                count++;
            else{
                if(arr[i]%k==0)
                    count+=arr[i]/k;
                else count+=arr[i]/k+1;
            }
            if(count>h) return false;
        }
        return true;
    }
}