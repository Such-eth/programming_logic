class MinStack {
    Stack<Integer> s1,s2;
    public MinStack() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.isEmpty() || s2.peek()>val)
            s2.push(val);
        else s2.push(s2.peek());
    }
    
    public void pop() {
        s1.pop();
        s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */