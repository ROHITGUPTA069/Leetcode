package BINARYSEARCH;
//leetcode 1095

public class findinmountainarray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(target, arr);
        System.out.println(ans);
    }
    static int search(int target, int[]arr){
        int peak = searchpeak(arr);
        int firstvalue = orderwisesearch(target, arr,0, peak);
        if(firstvalue != -1) {
            return firstvalue;
        }
        return orderwisesearch(target, arr, peak, arr.length);
    }
    //The peak value of an array
    static int searchpeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid+1] > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    static int orderwisesearch( int target, int[] arr,int start, int end){

        boolean isdec = arr[start] > arr[end];// decide whether  arr is asc or dec
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if(isdec) { // For decending array the func isdec is true then if part will run
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{ //for ascending order
                if(target < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1; //if no value is found
    }

}
