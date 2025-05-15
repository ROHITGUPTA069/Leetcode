package BINARYSEARCH;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,3,45,56,67,87,98,900};
        int target = 87;
        System.out.println(binarysearch(arr, target));
    }
    //For ascending order find the element
    //return -1(if index not found);
    //return index;
    static int binarysearch(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(start > end){
            return -1;
        }
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
