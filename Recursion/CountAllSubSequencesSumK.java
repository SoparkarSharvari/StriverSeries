package Recursion;

public class CountAllSubSequencesSumK {
    public static void main (String[] args){
        int[] arr={4,2,1};
        int k=10;
        System.out.println(countSubsequences(arr, k));
        System.out.println(isSubsequences(arr, k));
    }

    public static int countSubsequences(int[] arr, int k){
        return countSubsequenceshelper(k,arr,0,0);
    }

    public static int countSubsequenceshelper(int k , int[] arr, int ans,int pos){
       
        if(ans == k){
            return 1;
        }
        if(pos == arr.length || ans > k){
            return 0;
        }
 
            int take = countSubsequenceshelper(k, arr, ans+arr[pos], pos+1);
            int nottake = countSubsequenceshelper(k, arr, ans, pos+1);
        
        return nottake + take ;
    }


     public static boolean isSubsequences(int[] arr, int k){
        return isSubsequenceshelper(k,arr,0,0);
     }

     public static boolean isSubsequenceshelper(int k , int[] arr, int ans,int pos){
        if(ans == k){
            return true;
        }
        if(pos == arr.length || ans > k){
            return false;
        }
 
            boolean take = isSubsequenceshelper(k, arr, ans+arr[pos], pos+1);
            boolean nottake = isSubsequenceshelper(k, arr, ans, pos+1);
        
        return nottake || take ;
     }
}
