package recursion;
import java.util.*;
public class sumOFsubset {
    public static void main(String[] args) {
        int arr[] = {1,2,3 };
        System.out.println(subsets(arr));
        System.out.println(sum(subsets(arr)));
    }

    public static int sum(List<List<Integer>> list){
        int sum = 0;
        for(List<Integer> inner: list){
            for(int num: inner){
                sum += num;
            }
        }
        return sum;
    }

    public static List<List<Integer>> subsets(int[] arr){
        int start = 0;
        int end = 0;

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i = 0; i < arr.length; i++){
            if(i>0 && arr[i-1] == arr[i]){
                start = end +1;
            }
            end = outer.size()-1;
            for( int j = start; j <= end; j++ ){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
