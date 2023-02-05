import java.util.Arrays;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(binarySearch(arr,2*arr[i],i)!=i && binarySearch(arr,2*arr[i],i)!=-1){
                return true;
            }
        }
        return false;
    }
    public int binarySearch(int[] arr,int target,int i) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}