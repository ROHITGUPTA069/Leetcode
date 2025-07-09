package String;

public class largestoddnumberBigBrainVersion {
    public static void main(String[] args) {

    }

    public static String largestnumber(String num){
        for(int i = num.length() - 1; i >= 0; i--){
            char ch = num.charAt(i);
            if(ch % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
