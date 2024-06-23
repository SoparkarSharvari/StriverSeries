package Arrays.Medium;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target = 9;

    }
    public static int[] twoSum(int[] array, int target) {
        int[] outArray=new int[2];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                int sum=array[i]+array[j];
                if(sum==target){
                    outArray[0]=i;
                    outArray[1]=j;
                    break;
                }
                else{
                    continue;
                }
            }
    }
        return outArray;
    }
}
