package BINARYSEARCH;

//FIND THE CEILING ELEMENT.
public class SmallestElementlargestarray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 17; //Situation 1: The Target is present
        System.out.println(search(arr,target));
    }
    static int search(int arr[], int target){
        int start = 0 ;
        int end = arr.length;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

}
