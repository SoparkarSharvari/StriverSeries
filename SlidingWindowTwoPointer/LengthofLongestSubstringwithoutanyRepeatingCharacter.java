package SlidingWindowTwoPointer;

import java.util.HashMap;
import java.util.Scanner;

public class LengthofLongestSubstringwithoutanyRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();     
        System.out.println(str);
        System.out.println(lengthOfLongestSubstring(str));
        
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        return 0;

        HashMap <Character ,Integer> map = new HashMap<Character,Integer>();

        int maxSubstring=0;
        int left =0,right=0;
        while(s.length() > right){
            if(map.containsKey(s.charAt(right))){
               left = map.get(s.charAt(right)) + 1;
            }
            
                map.put(s.charAt(right),right);
                maxSubstring = Math.max(right-left+1,maxSubstring);
                right++;
            
        }
        return maxSubstring;
    }
}