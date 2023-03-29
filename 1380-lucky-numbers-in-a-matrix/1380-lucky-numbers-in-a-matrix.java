class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int rind=min_ind_in_row(matrix,i);
            int cind=max_in_col(matrix,rind);
            if(matrix[i][rind]==cind){
                l.add(cind);
            }
        }
        return l;
    }
    public int min_ind_in_row(int[][] arr,int row){
        int min=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<arr[row].length;i++){
            if(arr[row][i]<min){
                min=arr[row][i];
                ind=i;
            }
        }
        return ind;
    }
    public int max_in_col(int[][] arr,int col){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][col]>max){
                max=arr[i][col];
            }
        }
        return max;
    }
}