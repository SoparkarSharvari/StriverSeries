package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        int n = nums.length;

        int[] dp = new int[n+1];

        for(int i=0;i<n;i++){
            dp[nums[i]]= -1;
        }

        for(int i=0;i<n+1;i++){
            if(dp[i] != -1){
                System.out.println(i);
                break;
            }
        }
    }
    //besttt ansssswerr
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int expectedSum = n*(n+1)/2; 
    //     int sum = 0;

    //     for(int num : nums) sum+=num;
    //     System.gc();
    //     return expectedSum - sum;
    // }
}
