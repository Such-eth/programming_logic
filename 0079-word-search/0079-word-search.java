class Solution {
    static boolean istrue=false;
    public static boolean exist(char[][] board, String word) {
        istrue=false;
        if(board.length==1 && board[0].length==1){
            return word.length()==1 && word.charAt(0)==board[0][0];
        }
        for (int i=0;i< board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] && !istrue)
                    helper(board,i,j,word);
            }
        }
        return istrue;
    }

    public static void helper(char[][] arr, int r, int c, String word) {
        if(word.equals("")){
            istrue=true;
            return;
        }
        if(wrongInd(arr,r,c)){return;}
        if(arr[r][c]=='.'){return;}
        if(arr[r][c] != word.charAt(0)){return;}
        arr[r][c]='.';
        if(r>0){
            helper(arr,r-1,c,word.substring(1));
        }
        if(r< arr.length-1){
            helper(arr,r+1,c,word.substring(1));
        }
        if(c>0){
            helper(arr,r,c-1,word.substring(1));
        }
        if(c<arr[0].length-1){
            helper(arr,r,c+1,word.substring(1));
        }
        arr[r][c]=word.charAt(0);
    }

    public static boolean wrongInd(char[][] arr, int r, int c) {
        if(r<0 || r>= arr.length){return true;}
        if(c<0 || c>= arr[0].length){return true;}
        return false;
    }
}