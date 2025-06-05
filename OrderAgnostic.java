package BINARYSEARCH;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {9, 90, 900, 8008, 71233, 411111};
        int target = 71233;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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
        return Integer.MIN_VALUE; //if no value is found
    }
}
