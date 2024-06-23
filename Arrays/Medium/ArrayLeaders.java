package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr ={16,17,4,3,5,2};
        int n = 6;
        ArrayList<Integer> ans= leaders(n, arr);
        Collections.sort(ans, Collections.reverseOrder());
        
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
    public static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(max);
                // than max no. from right, hence leader.
            for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
            ans.add(arr[i]);
            max = arr[i];
            }

        return ans;
    }
}

