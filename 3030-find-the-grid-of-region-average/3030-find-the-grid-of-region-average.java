class Solution {
    int m = 0, n = 0;
    int[][] result = null;
    int[][] count = null;
    public int[][] resultGrid(int[][] image, int threshold) {
        m = image.length; n = image[0].length;
        result = new int[m][n];
        count = new int[m][n];
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                result[i][j] = Integer.MIN_VALUE;
        
        for(int col = 0; col <= n-3; col++) {
            for(int row = 0; row <= m-3; row++) {
                int currentAverage = calculateCurrentAverage(image, row, col, threshold);
                if(currentAverage == Integer.MIN_VALUE) {
                    continue;
                }
                updateAverage(image, row, col, currentAverage, threshold);
            }
        }
        
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                if(result[i][j] != Integer.MIN_VALUE)
                    result[i][j] = (result[i][j] / count[i][j]);
                else
                    result[i][j] = image[i][j];
        
        return result;
    }
    
    public void updateAverage(int[][] image, int row, int col, int currentAverage, int threshold) {
        for(int i = row; i < row+3; i++) {
            for(int j = col; j < col+3; j++) {
                if(result[i][j] == Integer.MIN_VALUE) {
                    result[i][j] = currentAverage;
                } else {
                    result[i][j] += currentAverage;
                }
                count[i][j]++;
            }
        }
    }
    
    public int calculateCurrentAverage(int[][] image, int row, int col, int threshold) {
        int tempSum = 0;
        for(int i = row; i < row+3; i++) {
            for(int j = col; j < col+3; j++) {
                if(!isCurrentPositionValid(image, i, j, threshold, row, col)) {
                    return Integer.MIN_VALUE;
                }
                tempSum += image[i][j];
            }
        }
        return tempSum/9;
    }
    
    public boolean isCurrentPositionValid(int[][] image, int row, int col, int threshold, int startRow, int startCol) {
        if(row - 1 >= startRow && Math.abs(image[row-1][col] - image[row][col]) > threshold)
            return false;
        if(row + 1 <= startRow + 2 && Math.abs(image[row+1][col] - image[row][col]) > threshold)
            return false;
        if(col - 1 >= startCol && Math.abs(image[row][col-1] - image[row][col]) > threshold)
            return false;
        if(col + 1 <= startCol + 2 && Math.abs(image[row][col+1] - image[row][col]) > threshold)
            return false;
        return true;
    }
}