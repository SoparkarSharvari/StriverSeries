package BinarySearch.BSon1DArrays;

public class upperBound {
    public static void main(String[] args) {
        int[] nums={1,2,8,10,11,12,19};
        int target =5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
        int ans =nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] > target ){
                ans =mid;
                high = mid -1;
            }else{
                low =mid+1;
            }

        }
        return ans;
    }
}
