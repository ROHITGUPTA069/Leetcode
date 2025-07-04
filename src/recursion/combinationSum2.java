package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum2 {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = CombinationSum(arr, target);
        System.out.println(ans);
    }
    private static List<List<Integer>> CombinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> outer = makecombo(candidates, target, 0, new ArrayList<>());
        return outer;
    }
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

        //make a loop
        for(int i = index; i < candidate.length; i++){

            if(i > index && candidate[i] == candidate[i-1]){
                continue;
            }
            //recursion
            list.add(candidate[i]);
            list1.addAll(makecombo(candidate, target-candidate[i] , i+1, list));
            //backtrack
            list.remove(list.size() -1);
        }
     return list1;
    }
}
