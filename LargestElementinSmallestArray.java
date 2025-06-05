package BINARYSEARCH;

public class LargestElementinSmallestArray {
    public static void main(String[] args) {
        int arr[] = {2,4,45,56,76,89,90};
        int target = 1;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int []arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(end >= start){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;
    }
}
