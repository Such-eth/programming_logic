class Solution {
    public int compareVersion(String v1, String v2) {
        String[] a1 = v1.split("\\.");
        String[] a2 = v2.split("\\.");
        int i=0,j=0;
        // System.out.println(Arrays.toString(a1));
        // System.out.println(Arrays.toString(a2));
        while(i<a1.length && j<a2.length){
            if(compare(a1[i])<compare(a2[j]))
                return -1;
            if(compare(a1[i])>compare(a2[j]))
                return 1;
            i++;
            j++;
        }
        while(i<a1.length){
            if(compare(a1[i])>0)
                return 1;
            i++;
        }
        while(j<a2.length){
            if(compare(a2[j])>0)
                return -1;
            j++;
        }
        return 0;
    }
    public int compare(String s){
        return Integer.parseInt(s);
    }
    
}