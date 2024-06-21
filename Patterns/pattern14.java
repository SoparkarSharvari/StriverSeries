package Patterns;

public class pattern14 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
