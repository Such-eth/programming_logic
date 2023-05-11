class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(!checkrowcol(board,i,j) || !checksq(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkrowcol(char[][] arr,int m,int n){
        int k=arr[m][n]-'0';
        if(k==-2)
            return true;
        for(int i=0;i<arr.length;i++){
            int x=arr[m][i]-'0';
            if(x!=-2 && i!=n && x==k){
                return false;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            int x=arr[i][n]-'0';
            if(x!=-2 && i!=m && x==k){
                return false;
            }
        }
        return true;
    }
    public boolean checksq(char[][] arr,int m,int n){
        int x,y;
        int z=arr[m][n]-'0';
        if(z==-2)
            return true;
        if(m<3){
            y=0;
        }else{
            y=m-m%3;
        }
        if(n<3){
            x=0;
        }else{
            x=n-n%3;
        }
        for(int i=y;i<y+3;i++){
            for(int j=x;j<x+3;j++){
                int a=arr[i][j]-'0';
                if(a!=-2 && !(i==m && j==n) && a==z){
                    return false;
                }
            }
        }
        return true;
    }
}