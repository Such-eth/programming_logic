class Solution {
    public int[] constructRectangle(int area) {
        int[] arr = new int[2];
        int w =(int)Math.sqrt(area);
        while(area%w>0){
            w--;
        }
        arr[0]=area/w;
        arr[1]=w;
        return arr;
    }
    
}