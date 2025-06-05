package BINARYSEARCH;

public class find_number_of_rotation{
    public static void main(String[] args){
        int[] nums = {15, 18, 2,3,6,12};
        System.out.println("The number of rotation are: " + search(nums));
    }
    static int search(int []nums){
        int nor = pivotsearch(nums);
        return nor + 1;
    }
    static int pivotsearch(int[] nums){
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
                end--;
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
