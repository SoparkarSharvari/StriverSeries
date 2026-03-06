package Recursion;


public class Atoi {
    public static void main(String[] args) {
        String str = "   -42";
        int result = myAtoi(str);
        System.out.println("The integer value is: " + result);
    }
    public static int myAtoi(String str){
        int i=0;
        // Remove leading whitespaces
        for(i=0 ; i<str.length();i++){
            if(str.charAt(i) !=' '){
                break;
            }
        }
        // Check for optional sign
        int sign=1;
        if(i<str.length() && (str.charAt(i)=='+' || str.charAt(i)=='-')){
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // Convert digits to integer
        return sign * convertToInt(str, i,0,sign);

    }
    public static int convertToInt(String str,int index,int result,int sign){
            final int INT_MIN_VAL = -2147483648;
            final int INT_MAX_VAL = 2147483647;
        if(index >= str.length() || !Character.isDigit(str.charAt(index))){
            return convertToInt(str, index+1, result, sign);
        }
        return INT_MAX_VAL;
        
    }
}