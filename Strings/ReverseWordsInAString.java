package Strings;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println("before : "+ s);
        s +=" ";
        System.out.println("add last space : "+ s);

        int left = 0;
        int rigth = s.length() -1;
         
        String temp ="";
        String ans ="";

        while(left <= rigth){
            char ch = s.charAt(left);

            if( ch != ' '){ // " " is for string // therfore only ' ' will work
                temp += ch;
            }
            else{
                if( !ans.equals("")){
                    ans = temp + " " + ans;
                }
                else{
                    ans =temp;
                }
                temp = "";
            }
            left++;
        }

        System.out.println("add last space : "+ ans);
    }
}
