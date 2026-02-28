package BinarySearch.BSon1DArrays;

public class last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        int target = 1;
        int lastIndex = findLastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " is at index: " + lastIndex);
    }
    public static int findLastOccurrence(int[] arr, int target){
        int ans=-1;
        int low=0;        
        int high=arr.length-1;
        int mid=(low+high)/2;
        while (low<=high){
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]> target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=(low+high)/2;
            
        }
        return ans;
    }
}
