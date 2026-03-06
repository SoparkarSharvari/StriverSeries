package Recursion;

public class GenrateAllBinaryString {
    public static void main(String[] args){
        int n=3;
        genrateAllBinaryString(n,"");
    }
    public static void genrateAllBinaryString(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        genrateAllBinaryString(n-1,ans+"0");
        genrateAllBinaryString(n-1,ans+"1");
    }
}