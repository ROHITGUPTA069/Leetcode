package recursion;
import java.util.*;
public class combinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5};
        int target = 8;
        List<List<Integer>> ans = CombinationSum(arr, target);
        System.out.println(ans);
    }

    private static List<List<Integer>> CombinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = makecombo(candidates, target, 0, new ArrayList<>());
        return outer;
    }

    //making combo using recursion and baktrack
    private static List<List<Integer>> makecombo(int[] candidate, int target, int index, List<Integer> list){
        List<List<Integer>> list1 = new ArrayList<>();

        //base case potential ans found
        if(target == 0){
            list1.add(new ArrayList<>(list));
            return list1;
        }
        //checks the index inside the candidate
        if(index >= candidate.length){
            return list1;
        }
        //access of the element
        int element = candidate[index];

        //pick it
        if(target >= element){
            //add the element
            list.add(element);
            list1.addAll(makecombo(candidate, target-element, index, list));
            //backtrack it
            list.remove(list.size() -1);
        }
        //ignore it
        list1.addAll(makecombo(candidate, target, index+1, list));
        return list1;
    }
}
