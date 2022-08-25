package java_lang.leetcode_problems.unsorted.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("anviaj"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        int maxstring = 0;
        HashSet<Character> currentstring = new HashSet<>();
        while(right < s.length()){
            if(right == s.length() -1){
                currentstring.add(s.charAt(right));
                if(currentstring.size() > maxstring){
                    maxstring = currentstring.size();
                }
            }
            if(left != right && currentstring.contains(s.charAt(right))){


                if(currentstring.size() > maxstring){
                    maxstring = currentstring.size();
                }
                right = left;
                currentstring = new HashSet<>();
                left++;
                currentstring.add(s.charAt(left));


            }
            currentstring.add(s.charAt(right));
            right++;

        }
        if(maxstring == 0) return s.length();
        return maxstring;
    }
}
