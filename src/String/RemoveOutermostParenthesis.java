package String;

public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
    String s = RemoveOutermostParenthesis.removeOuterParentheses("(()())(())");
        System.out.println(s);
    }
    public static String removeOuterParentheses(String s) {
        return result("", s, 0, 0);
    }
    public static String result(String p, String up, int index, int balance){
        if(index == up.length()){
            return p;
        }
        char ch = up.charAt(index);
        if(ch == '('){
            balance++;
            if(balance > 1){
                p += ch;
            }
        }
        else{
            balance--;
            if(balance > 0){
                p += ch;
            }
        }
        return result(p, up, index+1, balance);
    }
}
