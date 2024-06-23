package Arrays.Easy;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int N = 6;
        int[] arr={12, 35, 1, 10, 34, 1};
        System.out.println("Second largest element is : "+print2largest(arr, N));
    }
    public static int print2largest(int arr[], int n) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;//-1 can also be given

        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max :"+max);
        for(int i=0;i<n;i++){
            if(arr[i] != max  && secmax < max && secmax < arr[i]){
                System.out.println("sec :"+secmax);
                secmax = arr[i];
            }
        }
        return secmax;
    }
}
