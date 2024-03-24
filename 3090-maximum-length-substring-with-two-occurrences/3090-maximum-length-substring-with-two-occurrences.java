class Solution {
    public int maximumLengthSubstring(String s) {
        int len = 0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            int j;
            for(j=i;j<s.length();j++){
                char ch = s.charAt(j);
                // System.out.print(ch+" "+map.get(ch)+"  ");
                if(map.get(ch)==null)
                    map.put(ch,1);
                else if(map.get(ch)==2)
                    break;
                else map.put(ch,map.get(ch)+1);
            }
            // System.out.println(i+" "+j+"------------");
            // System.out.println(map);
            len = Math.max(len,j-i);
        }
        return len;
    }
}