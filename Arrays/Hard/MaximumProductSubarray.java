package Arrays.Hard;

public class MaximumProductSubarray {
    public static void main(String[] arg){
        int[] nums ={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        // {2,3,-2,4};
        int maxvalue = maxProduct(nums);
        // int maxvalue = maxProductSubArray(nums);
        System.out.print(maxvalue);
    }

    // public static int maxProduct(int[] nums) {
    //     int maxval=nums[0];
    //     for(int i =0;i<nums.length;i++){
    //         int product=1;
            
    //             for(int j =i ;j<nums.length;j++){
    //                 System.out.println(i+ " "+j+ " "+product);
    //                 product *= nums[j];
    //                 maxval = Math.max(maxval, product);  System.out.println(maxval);
    //         }
    //     }
    //     return maxval;
    // }

    // Approach 2: Just the slight modification of previous approach. 
    // As we know that on multiplying with negative number max will become min and
    // min will become max, so why not as soon as we encounter negative element, we swap the max and min already.

    public int maxProduct2(int[] nums) {
        
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
        
			// Swapping min and max
            if (nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }
                


            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);


            ans = Math.max(ans, max);
        }
        
        return ans;

    }
    public static int maxProductSubArray(int arr[]) {
        int prod1 = arr[0],prod2 = arr[0],result = arr[0];
        
        for(int i=1;i<arr.length;i++) {
            int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
            prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
            prod1 = temp;
            
            result = Math.max(result,prod1);
        }
        
        return result;
        }

        
        // Approach 3: Two pointer Approach
        public static int maxProduct(int[] nums) {
        
            int n = nums.length;
            int l=1,r=1;
            int ans=nums[0];
            
            for(int i=0;i<n;i++){
                
                //if any of l or r become 0 then update it to 1
                l = l==0 ? 1 : l;
                r = r==0 ? 1 : r;
                
                l *= nums[i];   //prefix product
                r *= nums[n-1-i];    //suffix product
                
                ans = Math.max(ans,Math.max(l,r));
                
            }
            
            return ans;
    
        }
}
