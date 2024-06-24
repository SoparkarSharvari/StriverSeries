package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class Longest_subarray_sum_K_positive{
    public static void main(String[] args){
        // int[] arr ={10,5,2,7,1,9};
        int[] arr ={2, 3, 5, 1, 9};
        int K=10;
        System.out.println(lenOfLongSubarr(arr, arr.length, K));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {
        int maxLen=0;
        for(int i=0 ;i<N;i++){
            int sum=0;
            int Len=0;
            for(int j=i;j< N;j++){
                sum += A[j];
                Len++;
                if(sum == K){
                    maxLen = Math.max(maxLen, Len);
                }
            }
        }
        return maxLen;
    }
    public static int getLongestSubarray(int[] a , long k){
        int n = a.length;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];
            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;
            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
    
}
