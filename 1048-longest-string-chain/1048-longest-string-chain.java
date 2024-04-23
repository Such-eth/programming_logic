class Solution {
    int[][] dp;
    public int longestStrChain(String[] arr) {
        // System.out.println(isPredecessor(arr[2],arr[0]));
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        dp = new int[arr.length][arr.length+1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return find(arr,0,-1);
    }
    
    public int find(String[] arr,int ind,int prev){
        if(ind==arr.length)
            return 0;
        if(dp[ind][prev+1]!=-1)
            return dp[ind][prev+1];
        int take=0,notTake=0;
        // if(prev!=-1)
        //     System.out.println(ind+" "+prev+" "+isPredecessor(arr[ind],arr[prev]));
        if(prev==-1 || isPredecessor(arr[prev],arr[ind]))
            take = 1+find(arr,ind+1,ind);
        notTake = find(arr,ind+1,prev);
        return dp[ind][prev+1]=Math.max(take,notTake);
    }
    
    public boolean isPredecessor(String substr,String str){
        if(substr.length()+1 != str.length())
            return false;
        String regex = substr.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .collect(Collectors.joining(".?", ".?", ".?"));
        return str.matches(regex);
    }
}