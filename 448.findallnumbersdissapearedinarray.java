class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
          List<Integer> list = new ArrayList<>();
         cyclicSort(nums);
            for (int i = 0; i < nums.length; i++) {
                int element = i + 1;
                if (nums[i] != element ) {
                    list.add(element);
                }
            }
            return list;
    }   

    //to sort the function
    static void cyclicSort(int[] nums){
    int i = 0;
        while(i < nums.length){
        int correctindex = nums[i] -1;
            if(nums[i] != nums[correctindex]){
            swap(nums, i, correctindex);
            }
            else{
            ++i;
            }
        }
    }
    //to swap
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
