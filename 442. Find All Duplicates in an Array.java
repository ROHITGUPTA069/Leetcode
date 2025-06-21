class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //range of the number is 1 to n
        List<Integer> list = new ArrayList<>();
        //sort the array
        int index = 0;
        while(index < nums.length){
        
            int correctindex = nums[index] - 1;
            if(nums[correctindex] != nums[index]){
                swap(nums, index, correctindex);
            }
            else{
                ++index;//add the element if its present in its coorectposition
            }
            
        }
        //add the element if its dublicate
        for(int j = 0; j < nums.length; j++){
            int correct = j+1;
            if(nums[j] != correct){
                list.add(nums[j]);
            }
        }
        return list;
    }
    //swap the function
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
}
