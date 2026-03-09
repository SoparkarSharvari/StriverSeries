package Recursion;

import java.util.ArrayList;

public class GenrateParentheses {
    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }
    public static ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        generateParenthesishelper(0,0,"",result);
        return result;
    }
    public static void generateParenthesishelper(int NoOfOpenBrackets,int NoOfClosedBrackets,String ans,ArrayList<String> result){
        if(NoOfOpenBrackets == 3 && NoOfClosedBrackets == 3){
            result.add(ans);
            return;
        }
        if(NoOfOpenBrackets < 3){
            generateParenthesishelper(NoOfOpenBrackets+1, NoOfClosedBrackets, ans+"(", result);
        }
        if(NoOfClosedBrackets < NoOfOpenBrackets){
            generateParenthesishelper(NoOfOpenBrackets, NoOfClosedBrackets+1, ans+")", result);
        }
    }
}
