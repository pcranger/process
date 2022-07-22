package java_lang.leetcode_problems.unsorted.medium;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String maxstring = "";
        int left = 0, right = 1;
        while(right < s.length()){
            if(s.charAt(left) != s.charAt(right)){
                String currentstring = s.substring(left, right);
                if(currentstring.length()> maxstring.length()){
                    maxstring = currentstring;
                }
            }else{
                //if we found a day having even less price , we will buy the stock at that day.
                left = right;
            }
            right++;
        }
        return maxstring.length();
    }
}
