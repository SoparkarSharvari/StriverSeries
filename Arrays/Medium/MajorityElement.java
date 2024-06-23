package Arrays.Medium;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length / 2];
    }
}
