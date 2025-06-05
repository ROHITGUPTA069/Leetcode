package BINARYSEARCH;
import java.util.Arrays;
//    static int search(int []arr, int target) {
//        int start = 0;
//        int end = arr.length;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] < target) {
//                return searchfirst(arr,target);
//            } else {
//                return searchlast();
//            }
//        }
//        return -1;
//    }
//    static int searchfirst(int[] arr, int target){
//        int start = 0;
//        if(target < arr[mid]){
//
//        }
//        return -1;
//    }
//    static int searchlast(){
//        return -1;
//    }
//}
//        while(start<end){
//            int mid = start + (end - start)/2;
//            if(arr[mid] == target){
//                return mid;
//            }
//            else if(arr[mid] < target){
//                start = mid + 1;
//            }
//            else{
//                end = mid -1;
//            }
//        }
//        return -1;
public class Findfirstandlastposition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 4;
        Findfirstandlastposition fun = new Findfirstandlastposition();
        String ans =Arrays.toString(fun.searchRange(arr, target)) ;
        System.out.println(ans);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);

        if (ans[0] != -1) { // if first occurence is there then only check other one
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex == true) { //firstStartanswer is true
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}