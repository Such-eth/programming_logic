class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int len=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int length=0;
                while(set.contains(num+1)){
                    num+=1;
                    length++;
                }
                len = Math.max(len,length+1);
            }
        }
        return len;
    }
}