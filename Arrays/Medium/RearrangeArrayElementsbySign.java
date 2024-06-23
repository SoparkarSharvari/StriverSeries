package Arrays.Medium;


// 2 <= nums.length <= 2 * 105
// nums.length is even
// 1 <= |nums[i]| <= 105
// nums consists of equal number of positive and negative integers.


public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums ={3,1,-2,-5,2,-4};
        int n = nums.length;
        int[] ans = new int[n];
        ans = rearrangeArray(nums);
        for(int i=0;i<nums.length;i++){
        System.out.println(ans[i]);}
    }
    public static int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];
        int x = 0;
        int y = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                temp[x] = nums[i];
                x +=2;
            }
            else{
                temp[y] = nums[i];
                y +=2;
            }
        }
        return temp;
    }
}
