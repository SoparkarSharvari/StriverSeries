package Strings;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s ="LVIII";
        System.out.println("Given Romen Number :" + s);
        int num=0;
        int ans=0;
        int prev=0;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            
            switch(ch){
                case 'I': 
                    num = 1;
                    break;
                case 'V': 
                    num = 5;
                    break;
                case 'X': 
                    num = 10;
                    break;
                case 'L': 
                    num = 50;
                    break;
                case 'C': 
                    num = 100;
                    break;
                case 'D': 
                    num = 500;
                    break;
                case 'M': 
                    num = 1000; 
                    break;
            }
            if(prev > num){
                ans -= num;
            }
            else{
                ans +=num;
            }
            prev = num; //ONLY FOR GETTING THE PREVIOUS ROMAN LETTER // IN 'IV' I < V THEREFORE WE NEED TO SUBSTRACT 
            System.out.println("ans at each step :"+ans);
        }
        System.out.println("Integer Number :" + ans);
    }
}
