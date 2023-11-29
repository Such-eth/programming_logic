class Solution {
    public int search(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        // while(start<=end){
        //     int mid=start-(start-end)/2;
        //     if(arr[mid]>target){
        //         end=mid-1;
        //     }else if(arr[mid]<target){
        //         start=mid+1;
        //     }else{
        //         return mid;
        //     }
        // }
        return bin_search(arr,start,end,target);
    }
    public int bin_search(int[] arr,int start,int end, int target){
        if(start>end)
            return -1;
        int mid = start-(start-end)/2;
        if(arr[mid]>target){
            end=mid-1;
            return bin_search(arr,start,end,target);
        }else if(arr[mid]<target){
            start=mid+1;
            return bin_search(arr,start,end,target);
        }else{
            return mid;
        }
    }
}