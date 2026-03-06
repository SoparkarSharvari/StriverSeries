package Recursion;

public class GenrateAllBinaryStringNoConsecutiveOnes {
    public static void main (String[] args){
        int n=3;
        genrateAllBinaryStringNoConsecutiveOnes(n,"");
    }
    public static void genrateAllBinaryStringNoConsecutiveOnes(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        genrateAllBinaryStringNoConsecutiveOnes(n-1,ans+"0");
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='1'){
            genrateAllBinaryStringNoConsecutiveOnes(n-1,ans+"1");
        }
    }
}
