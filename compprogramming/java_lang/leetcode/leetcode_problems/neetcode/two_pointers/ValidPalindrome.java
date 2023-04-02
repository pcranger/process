package java_lang.leetcode_problems.neetcode.two_pointers;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
    }
    public static boolean isPalindrome(String s) {
        String reverse = "";
        String news = "";
        for(int i = 0; i <= s.length()-1; i++){
            char ascii = s.charAt(i);
            if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || (ascii>=48 && ascii<=57)){
                ascii = Character.toLowerCase(ascii);
                news += ascii;
            }
        }
        for(int i = news.length()-1; i>=0; i--){
            reverse += news.charAt(i);
        }
        return reverse.equals(news);
    }
}
