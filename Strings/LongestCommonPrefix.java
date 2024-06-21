package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        // String[] str = {"kkflower","flow","flight"};
        // String[] str = {"dog","racecar","car"};
        String[] str ={"car","kcarbdjs","caeresf","cearfgr"};
        String output =" ";

        if(str.length  == 1){
            output = str[0];
        }
        else{
            output = str[0];
            for(int i= 1 ; i<str.length;i++){
                System.out.println(str[i].indexOf(output));
                while(str[i].indexOf(output) != 0){ // if we find the entire word(output) in str[i] ... value is 0 ; esle -1 
                    output = output.substring(0,output.length()-1);
                    System.out.println("prefix :"+output);
                }
                // Returns the index within this string of the first occurrence of the specified substring.
            }
        }
        
        System.out.println("Output :" + output);
    }
    // class Solution {
    //     public String longestCommonPrefix(String[] strs) {
    //         Arrays.sort(strs);
    //         String s1 = strs[0];
    //         String s2 = strs[strs.length-1];
    //         int idx = 0;
    //         while(idx < s1.length() && idx < s2.length()){
    //             if(s1.charAt(idx) == s2.charAt(idx)){
    //                 idx++;
    //             } else {
    //                 break;
    //             }
    //         }
    //         return s1.substring(0, idx);
    //     }
    // }
}
