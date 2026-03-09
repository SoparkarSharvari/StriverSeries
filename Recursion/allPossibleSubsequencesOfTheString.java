package Recursion;

import java.util.ArrayList;

public class allPossibleSubsequencesOfTheString {
public static void main(String[] args) {
    String str = "abc";
    System.out.println(allPossibleSubsequences(str));
}
public static ArrayList<String> allPossibleSubsequences(String str)
 {
        ArrayList<String> result = new ArrayList<>();
        allPossibleSubsequencesHelper(str, 0, "", result);
        return result;
 }
 public static void allPossibleSubsequencesHelper(String str,int index,String ans,ArrayList<String> result){
    if(index == str.length()){
        result.add(ans);
        return;
    }
    // include the current character
    allPossibleSubsequencesHelper(str, index+1, ans+str.charAt(index), result);
    // exclude the current character
    allPossibleSubsequencesHelper(str, index+1, ans, result);
 }
 
}
