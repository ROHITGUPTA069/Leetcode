package BINARYSEARCH;

public class rotatedbinarysearchwithdublicatedarray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,5,0,1,2};
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
    //Normal binary search.
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
    //To search a pivot in a rotated binary search
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
            //skipping part and if pivot lies in start and end
            if(nums[start] == nums[mid] &&nums[mid]== nums[end]){
                if(nums[start]> nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end-1]>nums[end]){
                    return end-1;
                }
                end++;
            }
            // searching left if right is sorted
            if(nums[start] <= nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }
            //or searching right if left is sorted
            else{
                end = mid-1;
            }

        }
        return -1;
    }
}
