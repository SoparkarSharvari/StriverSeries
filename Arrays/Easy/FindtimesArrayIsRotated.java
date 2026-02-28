package Arrays.Easy;

public class FindtimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int rotations = countRotations(arr);
        System.out.println("The array is rotated " + rotations + " times.");
    }

    public static int countRotations(int[] arr){
        int low=0;
        int high = arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if (arr[mid] > arr[high]){
                low=mid+1;
            }
             else if (arr[mid] < arr[high]){
                high=mid;
            }
        }
        return low;
 }   
}

