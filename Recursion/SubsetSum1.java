package Recursion;
import java.util.ArrayList;


public class SubsetSum1 {
    public static void main(String[] args) {
        int n = 2;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        ArrayList<Integer> result = subsetSums(arr, n);
        System.out.println(result);
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        subsetSum(arr,res,n,0,0);
        return res;
    }
    static void subsetSum(ArrayList<Integer> arr,ArrayList<Integer> res,int n,int ptr,int sum){
        if (ptr == n) {
            res.add(sum);
            return;
        }
        subsetSum(arr,res,n,ptr+1,sum);
        subsetSum(arr,res,n,ptr+1,sum+arr.get(ptr));
    }
}
