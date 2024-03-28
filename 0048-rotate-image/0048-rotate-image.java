class Solution {
    public void rotate(int[][] matrix) {
        findTranspose(matrix);
        reverseCol(matrix);
    }
    public void findTranspose(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int row=0;row<m;row++){
            for(int col=0;col<n && col<row;col++){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
            }
        }
    }
    public void reverseCol(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int row=0;row<m;row++){
            for(int col=0;col<n/2;col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n-col-1];
                matrix[row][n-col-1] = temp;
            }
        }
    }
}