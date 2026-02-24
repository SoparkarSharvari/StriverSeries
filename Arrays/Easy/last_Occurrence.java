package Arrays.Easy;

public class last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        int lastIndex = findLastOccurrence(arr, target);
        System.out.println("Last Occurrence of " + target + " is at index: " + lastIndex);
    }
}
