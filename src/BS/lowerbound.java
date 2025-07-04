package BS;

public class lowerbound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int[] nums2 = {3,5,8,15,19};
        int ans = lowerbound.lowerBound1(nums2, 9);
        System.out.println(ans);
    }
    public static int lowerBound1(int[] nums, int x) {
        int start = 0;
        int end  = nums.length - 1;
        int mid = 0;
        while(start <= end){
             mid =  start + (end - start)/2;
            if(nums[mid] >= x){
                //search for left
               end = mid-1;
            }
            //otherwise search for right
            else{
                start = mid +1;
            }
        }
        if(nums[mid] > x ){
            return mid;
        }
        return nums.length;
    }

}
