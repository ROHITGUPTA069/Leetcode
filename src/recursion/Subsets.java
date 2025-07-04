package recursion;
import java.util.*;
public class Subsets {
    public static void main(String[] args) {
    int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        //make a empty list
        outer.add(new ArrayList<>());
        //inner list
        List<Integer> inner = new ArrayList<>();
        int start = 0;
        int end = 0;
        int num = 0;
        for(int j = 0; j < nums.length;  j++){
            start = 0;
             num = nums[j];
            //check if the previous element is same or not
            if(j > 0 && num == nums[j-1]){
                start = end + 1;
            }
            end = outer.size() -1;
            //copy the outer loop
            for(int i = start; i <= end; i++){
                inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
