package BS;

public class upperbound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int[] nums2 = {3,5,8,15,19};
        int ans = upperbound(nums2, 9);
        System.out.println(ans);
    }
    public static int upperbound(int[] nums, int target){
        int[] arr = new int[nums.length];
        int i = -1;
        int start = 0;
        int end  = nums.length - 1;
        int mid = 0;
        while(start <= end){
            mid =  start + (end - start)/2;
            if(nums[mid] <= target){
                arr[++i] = mid;
                //search for right for larger value then current mid but smaller than target
                start = mid +1;
            }
            //otherwise search for right
            else{
                end = mid -1;
            }
        }
        if(nums[mid] > target ){
            return arr[i-1];
        }
        return arr[i];
    }
}
