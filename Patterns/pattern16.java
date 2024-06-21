package Patterns;

public class pattern16 {
    public static void main(String[] args) {
        char k='A';
        for(int i=1;i<=5;i++){
            for(char j=1;j<=i;j++){
                System.out.print(k);
            }
            k++;
            System.out.println("");
        }
    }
}
