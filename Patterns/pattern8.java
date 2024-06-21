package Patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int col = n *2 -1;
        for(int i=0;i<n;i++){
            for(int j=0;j<col-i;j++){
                if(j >= i && j <= col-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
