class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int[] arr = new int[2];
        while(start<=end){
            int a=numbers[start]+numbers[end];
            if(a>target){
                end--;
            }else if(a<target){
                start++;
            }else{
                arr[0]=start+1;
                arr[1]=end+1;
                break;
            }
        }
        return arr;
    }
}