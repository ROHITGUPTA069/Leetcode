package String;

import java.util.ArrayList;

public class largestOddNumbers {

    public static void main(String[] args) {
        String num = "2928327648";
        String result = largestOddNumber(num);
        System.out.println(result);
    }

    public static String largestOddNumber(String num) {


        //used to store all the subsets and odd number
        ArrayList<Long> arr = new ArrayList<>();
        subsetContigous(arr, num);

        //check if the arr is empty
        if(arr.isEmpty()){
            return "";
        }

        //search for the largest odd numbernumber
        Long max = 0L;
        for(Long i: arr){
            if(i > max){
                max = i;
            }
        }

        //now convert into strings
        String ans = Long.toString(max);
        return ans;
    }

    //check the odd values
    public static boolean checkOdd(Long num){
        long remainder = num % 2;
        if(remainder != 0){
            return true; //the number is odd
        }
        else{
            return false;
        }
    }

    //make all the subset
    public static void subsetContigous(ArrayList<Long> arr, String num){

        //placing the values inside array
        for(int i = 0; i < num.length(); i++){
           for(int j = i +1; j <= num.length(); j++){
              String str = num.substring(i, j);
              Long number = Long.parseLong(str); // convert into int
               //check the number
               if(checkOdd(number)){
                   arr.add(number);
               }
           }
        }
    }

}
