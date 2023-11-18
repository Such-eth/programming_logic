class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
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
        int[] ans = new int[numCourses];
        int iterator=0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int it : graph.get(curr)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
            ans[iterator++]=curr;
        }
        if(iterator==numCourses)
            return ans;
        return new int[0];
    }
}