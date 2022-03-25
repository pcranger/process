package java_lang.Explore.array_and_string.IntroString;

import java.util.Arrays;
//["reflower","flow","flight"]
//Output:"fl"
//Expected:""

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[]{"a"};
        System.out.println(longestCommonPrefix(str));

    }
    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 1) return strs[0];

        Arrays.sort(strs);
        String first = strs[0];

        String longestprefix = "";
        //compare with every element
        for(int i = strs.length - 1; i > 0 ; i--){
            String last = strs[i];
            //compare first and last element (in a sorted array)
            String prefix = Commonprefix(first,last);
            if(longestprefix.length() < prefix.length()) longestprefix = prefix;
        }

        return longestprefix;
    }

    public static String Commonprefix(String a, String b){
        String result = "";
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i)){
                result+= a.charAt(i);
            }
            else break;
        }

        return result;
    }
}
