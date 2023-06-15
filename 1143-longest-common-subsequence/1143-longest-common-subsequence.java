class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] arr = new int[t1.length()+1][t2.length()+1];
        for(int i=0;i<t1.length()+1;i++){
            arr[i][0]=0;
        }
        for(int i=0;i<t2.length()+1;i++){
            arr[0][i]=0;
        }
        for(int i=1;i<t1.length()+1;i++){
            for(int j=1;j<t2.length()+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1))
                    arr[i][j]=arr[i-1][j-1]+1;
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        return arr[t1.length()][t2.length()];
    }
}