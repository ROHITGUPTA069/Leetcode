class Solution {
    public int missingNumber(int[] nums) {
        
        cyclicsort(nums);
        for(int i = 0; i<nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    //function to sort
        public void cyclicsort(int[] nums){
        int index = 0;

            while(index < nums.length) {
            int correctIndex = nums[index]; // the number is its index
            if (nums[index] < nums.length && nums[index] != nums[correctIndex]){

                //check if the index is empty
                swap(nums, index, correctIndex);
            }
            else{
                ++index;
                }
            }
        }
        //sunction to swap
        public void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
