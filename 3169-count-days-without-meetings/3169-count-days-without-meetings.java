class Solution {
    public int countDays(int days, int[][] m) {
        PriorityQueue<Pair> q = new PriorityQueue<>((p1,p2)->p1.st-p2.st);
        for(int i=0;i<m.length;i++){
            q.offer(new Pair(m[i][0],m[i][1]));
        }        
        Stack<Pair> st = new Stack<>();
        st.push(q.poll());
        while(!q.isEmpty()){
            Pair p1 = st.peek();
            Pair p2 = q.poll();
            if(p1.end>=p2.st){
                if(p2.end>p1.end){
                    st.pop();
                    st.push(new Pair(p1.st,p2.end));
                }else continue;
            }else st.push(p2);
        }
        int count=0;
        while(!st.isEmpty()){
            Pair p = st.pop();
            count+= p.end-p.st+1;
        }
        return days-count;
    }
    class Pair{
        int st;
        int end;
        public Pair(int st,int end){
            this.st=st;
            this.end=end;
        }
    }
}