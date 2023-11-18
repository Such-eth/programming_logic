class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            graph.get(pre[i][1]).add(pre[i][0]);
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it : graph.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int it : graph.get(curr)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
            count++;
        }
        if(count==numCourses)
            return true;
        return false;
    }
}