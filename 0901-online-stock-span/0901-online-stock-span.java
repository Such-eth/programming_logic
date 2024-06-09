class StockSpanner {
    
    class Pair{
        int val;
        int count;
        Pair(int val,int count){
            this.val=val;
            this.count=count;
        }
    }
    
    Stack<Pair> st;
    
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        if(st.isEmpty() || price<st.peek().val){
            st.push(new Pair(price,1));
            return 1;
        }
        int count=0;
        while(!st.isEmpty() && price>=st.peek().val)
            count+=st.pop().count;
        st.push(new Pair(price,count+1));
        return count+1;        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */