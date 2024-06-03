class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<Integer> prev = new Stack<>();
        Stack<Integer> nxt = new Stack<>();
        int[] a1 = new int[h.length];
        int[] a2 = new int[h.length];
        prev.push(0);
        for(int i=1;i<h.length;i++){
            while(!prev.isEmpty() && h[i]<h[prev.peek()]){
                a1[prev.pop()]=i;
            }
            prev.push(i);
        }
        while(!prev.isEmpty())
            a1[prev.pop()]=h.length;
        nxt.push(h.length-1);
        for(int i=h.length-2;i>=0;i--){
            while(!nxt.isEmpty() && h[i]<h[nxt.peek()]){
                a2[nxt.pop()]=i;
            }
            nxt.push(i);
        }
        while(!nxt.isEmpty())
            a2[nxt.pop()]=-1;
        int area=0;
        for(int i=0;i<h.length;i++){
            area=Math.max(area,(a1[i]-a2[i]-1)*h[i]);
        }
        // System.out.println(Arrays.toString(a1));
        // System.out.println(Arrays.toString(a2));
        return area;
    }
}