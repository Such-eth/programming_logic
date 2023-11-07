class MinStack {
    
    ArrayList<Integer> list;
    PriorityQueue<Integer> q;
    
    public MinStack() {
        list = new ArrayList<>();
        q = new PriorityQueue<Integer>();
    }
    
    public void push(int val) {
        list.add(val);
        q.add(val);
    }
    
    public void pop() {
        System.out.println(list);
        q.remove(list.get(list.size()-1));
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return q.peek();
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