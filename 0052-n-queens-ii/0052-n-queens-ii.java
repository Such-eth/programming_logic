class Solution {
    static List<List<String>> l=new ArrayList<>();
    static int count=0;
    public static int totalNQueens(int n) {
        l=new ArrayList<>();
        count=0;
        boolean[][] board = new boolean[n][n];
        printWays(board,0);
        return count;
    }
    private static void printWays(boolean[][] board, int row) {
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                printWays(board,row+1);
                board[row][col]=false;
            }
        }
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        //vertical
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //left diag:
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //right diag:
        int maxright=Math.min(row, board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}