class Solution {
    public int minAnagramLength(String s) {
        // System.out.println(check(s,1));
        // List<Integer> list = new ArrayList<>();
        // for(int i=1;i<=s.length();i++)
        //     if(s.length()%i==0)
        //         list.add(i);
        // // System.out.println(list);
        // int min = 0;
        // int max = list.size()-1;
        // int ans = max;
        // while(min<=max){
        //     int mid = min-(min-max)/2;
        //     if(check(s,list.get(mid))){
        //         ans=mid;
        //         max=mid-1;
        //     }else min = mid+1;
        // }
        // System.out.println(ans);
        for(int i=1;i<=s.length();i++)
            if(s.length()%i==0 && check(s,i))
                return i;
        return s.length();
    }
    public boolean check(String s,int k){
        int[] a1 = new int[26];
        for(int i=0;i<k;i++)
            a1[s.charAt(i)-'a']++;
        for(int i=k;i<=s.length()-k;i+=k){
            int[] a2 = new int[26];
            for(int j=i;j<i+k;j++)
                a2[s.charAt(j)-'a']++;
            for(int j=0;j<26;j++)
                if(a1[j]!=a2[j])
                    return false;
        }
        return true;
    }
}