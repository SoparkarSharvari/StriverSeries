package Arrays.Easy;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] Arr ={1, 8, 7, 56, 90};
        int max=-1;
        for(int i=0;i< Arr.length;i++){
            if(max < Arr[i]){
                max=Arr[i];
            }
        }
        System.out.println("The largest element of given array is: "+max);
    }
}
