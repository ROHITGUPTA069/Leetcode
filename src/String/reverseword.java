package String;

public class reverseword {
    public static void main(String[] args) {
        String s = "  hello world  ";
        String result = reverseWords(s);
        System.out.println(result);
    }
    public static String reverseWords(String s) {
    String[] arr = new String[s.length()];
    int index = 0; // index for the arr1
    String[] arr2 = new String[s.length()];
    int index2 = 0;// index for arr2;

    String str = "";
    //store the strings seperately;
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(ch == ' '){
            if(!str.isEmpty()){
                arr[index++] = str;
                str = "";
            }
        }
        else{
            str = str + ch;
        }
    }
    //add the last word
    if(!str.isEmpty())
        arr[index++] = str;

    //store in reverse order now
    for(int j = index-1; j >= 0; j--){
        arr2[index2++] = arr[j];
    }

    //till now all words are in reverse in arr2
        StringBuilder eeh = new StringBuilder();
    for(int k = 0 ; k < index2; k++){
        eeh.append(arr2[k]);
        if( k != arr2.length - 1 && k < index2 -1){
            eeh.append(" ");
        }
    }
    String result = eeh.toString();
    return result;
    }
}
