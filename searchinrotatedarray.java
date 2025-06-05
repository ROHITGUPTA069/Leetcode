package BINARYSEARCH;

//Rotate array question 189.
//Search in rotated sorted array is 39

public class searchinrotatedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
    static int search(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int pivot = pivotsearch(nums);
        if(pivot == -1){
            return binarysearch(nums, target, start, end);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        else if(nums[start] < target && target < nums[pivot]){
            return binarysearch(nums, target,start,pivot-1);
        }
        else{
            return binarysearch(nums, target,pivot+1, end);
        }
    }
    //Normal Binary search:-->
    static int binarysearch(int []nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        while( start <= end ){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    //For now return the value which is largest and from where the array is rotated:-->
    static int pivotsearch(int []nums){
        int start = 0;
        int end = nums.length -1;
        if(nums[start] < nums[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]< nums[mid-1]){
                return mid -1;
            }
            if(nums[mid] <=  nums[start]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}
