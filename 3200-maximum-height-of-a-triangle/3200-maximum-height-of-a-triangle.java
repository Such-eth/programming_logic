class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int way1 = formTri(red,blue);
        int way2 = formTri(blue,red);
        return Math.max(way1,way2);
    }
    
    public int formTri(int c1,int c2){
        int height=0;
        int balls = 1;
        while(c1>=0 && c2>=0){
            if(balls%2==1){
                if(c1<balls) return height;
                c1-=balls;
            }else{
                if(c2<balls) return height;
                c2-=balls;
            }
            balls++;
            height++;   
        }
        return height;
    }
}