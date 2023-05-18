class Solution {
    public int findMin(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid==0){
                mid++;
            }
            if(arr[mid-1]>arr[mid]){
                return arr[mid];
            }else if(arr[mid]>arr[0]){
                start=mid+1;
            }else if(arr[mid]<arr[0]){
                end=mid-1;
            }
        }
        return arr[0];
    }
}