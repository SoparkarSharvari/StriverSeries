package Arrays.Medium;

//Maximum Subarray Sum in an Array

// Kadane's Algorithm employs a dynamic programming 
// approach that iteratively calculates the maximum subarray sum ending at each position in the array.

public class KadanesAlgorithm {
    public static void main(String[] args) {
        // int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={-1,2,3};

        int n = nums.length;
        int maxSum = maxSubarraySumBruteForce(nums, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static int maxSubarraySumBruteForce(int[] arr , int n){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n;i++){
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    public static int maxSubarraySumBetter(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }

        return maxi;
    }
}
