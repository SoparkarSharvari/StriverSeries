package Arrays.Easy;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] nums ={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // The unique elements are from index 0 to uniqueIndex (inclusive)
        // The length of the array with unique elements is (uniqueIndex + 1)
        return uniqueIndex + 1;
}
}
