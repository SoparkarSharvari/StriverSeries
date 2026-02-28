package BinarySearch.BSon1DArrays;
public class SearchElement_Rotated_Sorted_Array{
    public static void main(String[] args){
        int[] arr = {4,5,5,6,7,0,0,1,2};
        int target = 8;
        boolean index = search(arr, target);
        System.out.println("Element " + target + " is at index: " + index);
    }
    public static boolean search(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[low]< arr[mid]){
                if(target <= arr[mid] && target >= arr[low]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(arr[low]> arr[mid]){
                if(target >= arr[mid] && target <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{
                low++;
            }
        }
        return false;
        }
}