class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> l = new ArrayList<>();
        l.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=l.get(l.size()-1)[1]){
                l.get(l.size()-1)[1]=Math.max(arr[i][1],l.get(l.size()-1)[1]);
            }else{
                l.add(arr[i]);
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}