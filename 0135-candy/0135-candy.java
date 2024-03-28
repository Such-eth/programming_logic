class Solution {
    public int candy(int[] r) {
        int[] ans = new int[r.length];
        Arrays.fill(ans,1);
        for(int i=1;i<r.length;i++){
            if(r[i-1]<r[i])
                ans[i]=ans[i-1]+1;
        }
        for(int i=r.length-2;i>=0;i--){
            if(r[i+1]<r[i])
                ans[i] = Math.max(ans[i],ans[i+1]+1);
        }
        int a=0;
        for(int i:ans)
            a+=i;
        return a;
    }
}