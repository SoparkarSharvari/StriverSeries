package Recursion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        int target=8;
        System.out.println(combinationSum2(arr,target));
    }
    public static List<List<Integer>> combinationSum2(int[] arr, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        combinationSum2Helper(arr, target, result, new ArrayList<>(), 0);
        return result;
    }
    public static  void combinationSum2Helper(int[] arr, int target , List<List<Integer>> result , List<Integer> ans , int pos){
        if (target == 0 ){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int i=pos; i<arr.length; i++){
            if (i > pos && arr[i] == arr[i - 1]) continue;
            if(arr[pos] > target ){
            break;
            }
            ans.add(arr[i]);
            combinationSum2Helper(arr, target-arr[i], result, ans, i+1);
            ans.remove(ans.size()-1);
    }
} 
}
