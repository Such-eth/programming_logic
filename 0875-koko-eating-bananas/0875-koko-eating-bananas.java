class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int val=Integer.MIN_VALUE;
        for(int i:piles)
            if(i>val)
                val=i;
        int start = 1;
        int end=val;
        int ans = val;
        while(start<=end){
            int mid = (start+end)/2;
            if(find(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }else start=mid+1;
        }
        return ans;
    }
    public boolean find(int[] arr,int v,int h){
        long val=0;
        for(int i:arr)
            val+=(int)Math.ceil(i/(double)v);
        return val<=h;
    }
}