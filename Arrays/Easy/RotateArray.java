package Arrays.Easy;


//Left rotate an array by D places
//Left Rotate an array by one place
public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k = 3;

        int rotateFor = k%nums.length ;

        if(rotateFor == 0 || nums.length <=1){
            System.out.println("Arr remains same ");
        }
        else{
            int[] tempArr = new int[rotateFor];
            for(int i=nums.length - rotateFor,j=0 ; i < nums.length ;i++ ,j++){
                tempArr[j] = nums[i];
                
            }
            for(int i=nums.length - rotateFor-1,j=0;i<nums.length;i++,j++){
                nums[i]= nums[j];
            }
            for(int i = 0; i < rotateFor; i++) {
                nums[i] = tempArr[i];
            }
        }
        for(int i=0; i <nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}
