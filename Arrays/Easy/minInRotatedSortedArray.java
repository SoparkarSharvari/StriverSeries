package Arrays.Easy;

public class minInRotatedSortedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int minElement = findMin(arr);
        System.out.println("Minimum element in the rotated sorted array is: " + minElement);
    }
    public static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<= arr[mid]){
                min=Math.min(min, arr[low]);
                low=mid+1;
            }
            else if (arr[mid]<arr[high]){
                min=Math.min(min,arr[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}
