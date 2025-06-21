class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        //since 1 to n therefore element = i +1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    //Function to sort using cyclicsort.
    static void cycleSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if(arr[correctindex] != arr[i]){
                swap(arr, correctindex, i);
            }
            else{
                i++;
            }
        }
    }

    //Function to swap
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
