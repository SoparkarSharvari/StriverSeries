package BinarySearch.BSon2DArrays;

import java.util.ArrayList;

public class Row_with_max_1s {
    public static void main(String[] args) {
        int N =4; 
        int M =4;
        int[][] Arr = {{0, 0, 0, 1},
        {0, 0, 1, 1},
        {1, 1, 1, 1},
        {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(Arr, N, M));
    }
    public static int rowWithMax1s(int arr[][], int n, int m) {
        int maxones=0;
        int index =-1;
        for(int i=0;i<n;i++){
            int currmaxone = m - lowerBound(arr[i], m, 1);
            if(currmaxone > maxones){
                maxones = currmaxone;
                index =i;
            }
        }
        return index;
    }
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }
}