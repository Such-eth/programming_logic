class Solution {
    public int minimumRecolors(String blocks, int k) {
        int a=blocks.length()-k+1;
        int[] arr = new int[a];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W'){count++;}
            }
            if(count<ans){ans=count;}
        }
        return ans;
    }
}