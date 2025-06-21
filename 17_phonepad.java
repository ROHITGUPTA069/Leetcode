class Solution {
    public List<String> letterCombinations(String digits) {
         return combo("", digits);
    }
    public static List<String> combo(String p, String up){
        List<String> list = new ArrayList<>();
        //base line
        if(up.isEmpty()){
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }
        //take the first digit
        char ch = up.charAt(0);
        //convert it into number
        int num = ch - '0';

        //converting the number into its letter
        if(num == 7){
            for(int i = 15; i<= 18; i++ ){
                char l1 = (char) ('a' + i);
                list.addAll(combo(p + l1, up.substring(1)));
            }
        }
        else if(num == 8){
            for(int i = 19; i<= 21; i++ ){
                char l2 = (char) ('a' + i);
               list.addAll(combo(p + l2, up.substring(1)));
            }
        }
        else if(num == 9){
            for(int i = 22; i<= 25; i++ ){
                char l3 = (char) ('a' + i);
                list.addAll(combo(p + l3, up.substring(1)));
            }
        }
        else{
            for(int i = (num - 2) * 3; i < (num -1) * 3; i++){
            char letter = (char)('a' + i);
            list.addAll(combo(p + letter, up.substring(1)));
        }
        }
        return list;
    }
}
