package BinarySearch.BSon1DArrays;

public class serachInsertPosition {
    public static void main(String[] args) {
        int[] nums={1,3,4,5};
        int target =2;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int ans =nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] > target){
                
                high = mid-1;ans = low;
            }
            else if(nums[mid] < target){
                
                low = mid + 1;ans=low;
            }
        }
        return ans;
    }
}
