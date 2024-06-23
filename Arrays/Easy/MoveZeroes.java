package Arrays.Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        
    }
    public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }
    }
}
