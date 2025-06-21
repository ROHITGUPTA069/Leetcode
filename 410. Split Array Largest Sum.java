class Solution {
    //Return the minimized largest sum
    //step-1: make a method that return the sub array
    //step-2: make a method that return the largest sum of the sub arrays
    //step-3: using this method i.e(splitArray) return the minimumized largest sum
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1; //pieces is the number of subarrays
            for (int num : nums) { //iteration of the array and converting into subarrays
                if (sum + num > mid) {
                    //make a new sub_array
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }  
}
