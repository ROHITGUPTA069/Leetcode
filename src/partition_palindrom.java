import java.util.*;
public class partition_palindrom {
    public static void main(String[] args) {
    String str = "aab";
        System.out.println(partition(str));
    }
    private static List<List<String>> partition(String s) {
        List<List<String>> outer = new ArrayList<>();
         makeSubsets(s, new ArrayList<>(), 0, outer);
    return outer;
    }

    private static  void makeSubsets(String up,  List<String> inner, int index, List<List<String>> outer){

        //check index
        if(index >= up.length()){
            outer.add(new ArrayList<>(inner));
            return ;
        }

        //check if its palindrom
        for(int i = index; i < up.length(); i++){
            String str = up.substring(index, i+1);
            if(isPalindrom(str)){
                inner.add(str);
                makeSubsets(up, inner, i+1, outer);
                inner.remove((inner.size()-1));
            }
        }
    }

    private static boolean isPalindrom(String p){
        String str = "";
        for(int i = p.length() - 1; i >= 0; i-- ){
            char ch = p.charAt(i);
            str = str + ch;
        }
        if(str.equals(p)){
            return true;
        }
        return false;
    }
}
