class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max=0,count=0;
        for(int i=0;i<rectangles.length;i++){
            int a=Math.min(rectangles[i][0],rectangles[i][1]);
            if(a>max){max=a;}
        }
        for(int i=0;i<rectangles.length;i++){
            int a=Math.min(rectangles[i][0],rectangles[i][1]);
            if(a==max){count++;}
        }
        return count;
    }
}