package Arrays.Easy;

public class LinearSearch {
    public static void main(String[] args) {
        int k=6;
        // int[] arr={1,2,3,4,5,6};
        int[] arr={1,2,4,5,7,8};

        System.out.println(searchInSorted(arr, arr.length, k));
    }
    public static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0 ; i < N ; i++){
            if(arr[i]==K){
                return 1;
            }
        }
        
        return 0;
    }
}
