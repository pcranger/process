package java_lang.Explore.array_and_string.IntroString;

public class ImplementstrStrSol {
    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "bba";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;


        for (int i = 0; i < haystack.length(); i++) {
            // no enough places for needle after i
            if (i + needle.length() > haystack.length()) break;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }

        return -1;
    }
}
