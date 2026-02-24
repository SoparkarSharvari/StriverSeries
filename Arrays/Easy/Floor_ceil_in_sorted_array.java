package Arrays.Easy;

public class Floor_ceil_in_sorted_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int floor = findFloor(arr, target);
        int ceil = findCeil(arr, target);
        System.out.println("Floor: " + floor);
        System.out.println("Ceil: " + ceil);
    }
    public static int findFloor(int[] arr, int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= (low + high )/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid] <= target){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int[] arr, int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid= (low + high )/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid] >= target){
                ans=arr[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
