package Patterns;

public class pattern18 {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
            char k=(char) ('E'-i);
            for (char ch = k; ch <= 'E'; ch++) {  // Loop to print characters from startChar to 'F'
                System.out.print(ch + " ");
            }
            System.out.println("");
        }
        
    }
}
