class Solution {
    static List<List<String>> l=new ArrayList<>();
    public static List<List<String>> solveNQueens(int n) {
        l=new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        printWays(board,0);
        return l;
    }
    private static void printWays(boolean[][] board, int row) {
        if(row==board.length){
            display(board);
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

    private static void display(boolean[][] board) {
        List<String> ans=new ArrayList<>();
        for(boolean[] a:board){
            String s="";
            for(boolean b:a){
                if(b)
                    s+="Q";
                else
                    s+=".";
            }
            ans.add(s);
        }
        l.add(ans);
    }
}