class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //find row
        int row=0,start=0;
        int end=matrix.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(matrix[mid][0]<target){
                row=mid;
                start=mid+1;
            }else if(matrix[mid][0]>target){
                end=mid-1;
            }else{
                return true;
            }
        }
        //find col
        int col=-1;
        start=0;
        end=matrix[0].length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(matrix[row][mid]<target){
                start=mid+1;
            }else if(matrix[row][mid]>target){
                end=mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}