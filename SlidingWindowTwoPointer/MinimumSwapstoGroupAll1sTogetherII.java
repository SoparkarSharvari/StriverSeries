package SlidingWindowTwoPointer;

public class MinimumSwapstoGroupAll1sTogetherII {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,0,0};
        System.out.println(minSwaps(arr));
    }
    // this is giving TLE
    public static int minSwaps(int[] nums) {
        int windowsize=0;
        int i=0;
        while(i < nums.length){
            windowsize+= nums[i];
            i++;
        }
        if(windowsize == 0 || windowsize == nums.length){
            return 0;
        }
        int currOnes=0;
        int minHole= Integer.MAX_VALUE;

        for(int k=0;k<nums.length;k++){
            int hole=0;
            currOnes=0;
            for(int j=k;j<k+windowsize;j++){
                currOnes+=nums[j% nums.length];
            }
            hole = windowsize - currOnes;
            minHole=Math.min(minHole , hole);
        }
        return minHole;
    }
}

//optimal solution

// class Solution {
//     public int minSwaps(int[] nums) {
//         int totalOnes = 0;
        
//         // Calculate the total number of 1's in the array
//         for (int num : nums) {
//             totalOnes += num;
//         }

//         // If there are no 1's or the entire array is 1's, return 0
//         if (totalOnes == 0 || totalOnes == nums.length) {
//             return 0;
//         }

//         int n = nums.length;
//         int minHoles = Integer.MAX_VALUE;
//         int currentHoles = 0;

//         // Calculate initial holes in the window of size totalOnes
//         for (int i = 0; i < totalOnes; i++) {
//             if (nums[i] == 0) {
//                 currentHoles++;
//             }
//         }
//         minHoles = currentHoles;

//         // Slide the window across the array
//         for (int i = 1; i < n; i++) {
//             // Update the number of holes by sliding the window
//             if (nums[i - 1] == 0) {
//                 currentHoles--;
//             }
//             if (nums[(i + totalOnes - 1) % n] == 0) {
//                 currentHoles++;
//             }
//             minHoles = Math.min(minHoles, currentHoles);
//         }

//         return minHoles;
//     }
// }
