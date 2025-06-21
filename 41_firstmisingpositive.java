class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclicsort(nums);
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i + 1){
                return i+1;
            }
           
        }
         return nums.length + 1;
    }
    public void cyclicsort(int[] arr){
        int index = 0;
        while(index < arr.length) {
            int correctindex  = arr[index] - 1;
        if (arr[index] > 0 && arr[index] <= arr.length && arr[index] != arr[correctindex]){
                Swap(arr, index, correctindex);
            }
            else{
                ++index;
            }
        }
    }

    public  void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
