package Recursion;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr ={2,3,6,7};
        int target= 7;
        List<List<Integer>> result = combinationSum(arr, target);
        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List < List < Integer >> res = new ArrayList<>();
        combinationSumMethod(candidates, target,0, new ArrayList<>(),res);
        return res;
    }
    public static void combinationSumMethod(int[] candidates, int target, int index , List<Integer> lst,List<List<Integer>> res) {

        if(index == candidates.length){
            if(target == 0){
                res.add(new ArrayList < > (lst)); ///
            }
            return;
        }
        if(candidates[index] <= target){
            lst.add(candidates[index]);
            combinationSumMethod(candidates, target-candidates[index], index, lst, res);
            lst.remove(lst.size() - 1); //
        }
        combinationSumMethod(candidates, target, index + 1, lst,res);

    }

}
