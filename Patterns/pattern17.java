package Patterns;

public class pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++){
            char k='A';
            for(int j=0;j<n+i;j++){
                if(j >= n-1-i && j <= n-1+i){
                    System.out.print(k);
                    if(j < n-1){
                        k++;
                    }
                    else{
                        k--;
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
