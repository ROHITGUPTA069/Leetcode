package String;

public class largestCommonPrefix {
    public static void main(String[] args) {

    }
    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || ch != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }

        }
    //return the whole first string
    return strs[0];
    }
}
