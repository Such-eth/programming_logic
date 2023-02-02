class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,ans=0;
        int end=letters.length-1;
        if(target>=letters[end]){
            return letters[0];
        }
        while(start<=end){
            int mid=start-(start-end)/2;
            if(letters[mid]>target){
                ans=mid;
                end=mid-1;
            }else if(letters[mid]<=target){
                start=mid+1;
            }
        }
        return letters[ans];
    }
}