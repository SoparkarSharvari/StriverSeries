
package Strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "abae";
        if(s.length() == 1){
            System.out.println(s);
        }
        else{
            int maxLen =1;
            String maxStr = s.substring(0, 1);

            //
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + maxLen; j <= s.length(); j++) {
                    if (j - i > maxLen && IsPalindrome(s.substring(i, j))) {
                        maxLen = j - i;
                        maxStr = s.substring(i, j);
                    }
                }
            }
            System.out.println(maxStr);
        }
    }
    static public Boolean IsPalindrome(String s) {
        int left=0;
        int right= s.length()-1;
        while(left<=right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}