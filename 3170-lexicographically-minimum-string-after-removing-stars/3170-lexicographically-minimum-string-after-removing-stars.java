class Solution {
    public String clearStars(String s) {
        PriorityQueue<Pair> q = new PriorityQueue<>((p1,p2)->{
            if(p1.ch==p2.ch)
                return p2.ind-p1.ind;
            else return p1.ch-p2.ch;
        });
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*')
                q.offer(new Pair(s.charAt(i),i));
            else q.poll();
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2)->p1.ind-p2.ind);
        while(!q.isEmpty())
            pq.offer(q.poll());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
            sb.append(String.valueOf(pq.poll().ch));
        // System.out.println(q.poll().ind);
        return sb.toString();
        
    }
    class Pair{
        char ch;
        int ind;
        Pair(char ch,int ind){
            this.ch = ch;
            this.ind = ind;
        }
    }
}