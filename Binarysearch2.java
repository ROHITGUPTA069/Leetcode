package BINARYSEARCH;

public class Binarysearch2 {
    public static void main(String[] args) {
    int []arr = {900, 90, 9, 8,7,4};
    int target = 7;
    int ans = search(arr, target);
        System.out.println(ans);
    }
    //for descending order.
    static int search(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(start >end){
            return Integer.MIN_VALUE;
        }
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Integer.MIN_VALUE;
    }
}
