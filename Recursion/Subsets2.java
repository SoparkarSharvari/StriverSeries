package Recursion;
import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[]  nums = {1,2,2};
        List<List<Integer>> result =  subsetsWithDup(nums);
        System.out.println(result);
    }
    
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subsets(nums, 0,new ArrayList<>(), res);
        return res;
    }
    
    public static void subsets(int[] nums, int ptr, List<Integer> item, List<List<Integer>> res) {
        res.add(new ArrayList<>(item));
        for (int i = ptr; i < nums.length; i++) {
            if (i > ptr && nums[i] == nums[i - 1]) continue;
            item.add(nums[i]);
            subsets(nums, i + 1, item, res);
            item.remove(item.size() - 1);
        }
    }
}
