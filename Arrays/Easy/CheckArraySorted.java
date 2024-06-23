package Arrays.Easy;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(check(arr));
    }
    public static boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}
