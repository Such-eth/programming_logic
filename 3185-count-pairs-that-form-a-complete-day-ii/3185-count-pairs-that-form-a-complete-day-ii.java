class Solution {
    public long countCompleteDayPairs(int[] hours) {
        long count=0,mul=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int hr:hours){
            if(hr%24==0){
                count+=mul;
                mul++;
            }            
            else{
                int num = 24-(hr%24);
                // System.out.println(hr+" "+map);
                if(map.containsKey(num))
                    count+=map.get(num);
                map.put(hr%24,map.getOrDefault(hr%24,0)+1);
            }
        }
        // System.out.println(mul);
        return count;
    }
}