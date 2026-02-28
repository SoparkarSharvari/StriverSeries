package BinarySearch.BSon1DArrays;

public class peakElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element is at index: " + peakIndex);
    }
    public static int findPeakElement(int[] arr){
        int low=0;
        int high= arr.length-1;
        while(low <=high){
            int mid=(low+high)/2;
            if(arr[mid]> arr[mid-1] && arr[mid]> arr[mid+1]){
                return mid;
            }
            else if (arr[])
        }
        retrun ;
    }
}
