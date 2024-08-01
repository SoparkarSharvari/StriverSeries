package SlidingWindowTwoPointer;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You can flip at most k 0's: ");
        int k = sc.nextInt(); 
        System.out.print("Size of array: ");
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        System.out.print("Enter elements for array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = longestOnes(arr, k);
        System.out.println("Maximum number of consecutive 1s: " + result);
    }
    public static int longestOnes(int[] nums, int k) {
        int left=0,right;
        int numzeros=0;
        int max=0;
        for(right=0;right<nums.length;right++){
            if(nums[right] == 0){
                numzeros++;
            }
            if(numzeros >k){
                if( nums[left] ==0){
                     numzeros--;
                }
                left++;
            }
            if(numzeros <= k){
                max=Math.max(max, right-left+1);
            }
        }
        return max;
    }
}
