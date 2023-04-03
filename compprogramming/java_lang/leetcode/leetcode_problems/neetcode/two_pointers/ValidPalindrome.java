package java_lang.leetcode_problems.neetcode.two_pointers;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome_tp("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String reverse = "";
        String news = removeNonAphabetical(s);
        for (int i = news.length() - 1; i >= 0; i--) {
            reverse += news.charAt(i);
        }
        return reverse.equals(news);
    }

    public static boolean isPalindrome_tp(String s) {
        String news = removeNonAphabetical(s);
        int i = 0;
        int j = news.length() - 1;
        while (i <= news.length() / 2 && j >= news.length() / 2) {
            if (news.charAt(i) != news.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    private static String removeNonAphabetical(String s) {
        String news = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            char ascii = s.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
                ascii = Character.toLowerCase(ascii);
                news += ascii;
            }
        }
        return news;
    }
}
