package BINARYSEARCH;

public class infiniteArray {
    public static void main(String[] args) {
        int []arr = {21,30,41,65,4898,7012,33322};
        int target = 41;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int []arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end] ){
            start = end + 1;
            end =  end * 2 +1;
        }
        return bs(arr,target,start,end);
    }
    static int bs(int []arr, int target, int start, int end){
        while( start <= end ){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
