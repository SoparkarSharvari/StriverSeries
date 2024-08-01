package SlidingWindowTwoPointer;

import java.util.HashMap;

public class FruitBasket {
   public static void main(String[] args) {
    Integer[] arr = {2,1,2,3,3,3,3};
    System.out.println(totalFruits(arr));
   }
   public static int totalFruits(Integer[] arr) {
        int left=0,right=0;
        int max=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        while(right < arr.length){
            map.put(arr[right],map.getOrDefault(arr[right],0 )+1);

            while(map.size()>2){
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            max=Math.max(max, right-left+1);
            right++;
        }
        return max;
   }
}
