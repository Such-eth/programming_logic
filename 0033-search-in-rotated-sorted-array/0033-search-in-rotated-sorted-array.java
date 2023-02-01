class Solution {
    public int search(int[] arr, int target) {
        if(arr.length==1){
            if(arr[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        int p=pivot(arr);
        int a=ordr_eg_bs(arr,target,0,p);
        if(a!=-1){
            return a;
        }else{
            return (ordr_eg_bs(arr,target,p+1, arr.length-1));
        }
    }
    private static int ordr_eg_bs(int[] arr, int target, int start, int end) {
        while(start<=end){
            int mid=start-(start-end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int pivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start-(start-end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[start]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}