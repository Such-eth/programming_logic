class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> g = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            g.add(new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            g.get(pre[i][1]).add(pre[i][0]);
        }
        int[] vis = new int[numCourses];
        int[] path = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(vis[i]==0)
                if(check(g,vis,path,i)==true)
                    return false;
        }
        
        return true;
    }
    public boolean check(List<List<Integer>> g, int[] vis,int[] path, int ind){
        vis[ind] = 1;
        path[ind]= 1;
        for(int i:g.get(ind)){
            if(vis[i]==0){
                if(check(g,vis,path,i)) return true;
            }else if(path[i]==1){
                return true;
            }
        }
        path[ind]=0;
        return false;
    }
    
}