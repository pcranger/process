package java_lang.problems_and_solutions;

import java.util.ArrayList;

public class P500keyboard {
    public static void main(String[] args) {

        String[] words = { "Hello", "Alaska", "Dad", "Peace" };
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        String[] rows = { row1, row2, row3 };
        ArrayList<String> result = new ArrayList<>();
        for (String word : words) {
            for (String row : rows) {
                if (isStr1CreatedFromStr2(word, row)) {
                    result.add(word);
                }
            }
        }
        System.out.println(result);

    }

    public static boolean isStr1CreatedFromStr2(String str1, String str2) {

        boolean creatable = false;
        str1 = str1.toLowerCase();
        int wordlength = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                char charofword = str1.charAt(i);
                char charofrow = str2.charAt(j);
                if (charofword == charofrow) {
                    wordlength += 1;
                }
            }
        }
        if (wordlength == str1.length()) {
            creatable = true;
        }
        return creatable;
    }
}
