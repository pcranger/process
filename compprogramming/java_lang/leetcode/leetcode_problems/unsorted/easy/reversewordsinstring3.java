package java_lang.leetcode_problems.unsorted.easy;

public class reversewordsinstring3 {

    public static void main(String[] args) {
        String result = reverseWords("Let's take LeetCode contest");
        System.out.println(result);
        System.out.println(result.length());
        System.out.println("s'teL ekat edoCteeL tsetnoc".length());
        System.out.println("s'teL ekat edoCteeL setnoc");

    }

    public static String reverseWords(String s) {
        int prevpos = 0;
        int currpos = 0;
        String rsub = "";
        String result = "";
        for(int i = 0; i < s.length(); i++){

            if(i == s.length()-1){
                currpos = i+1;
                rsub = reverse(s.substring(prevpos,currpos));
                result += rsub ;
                return result;
            }

            if(s.charAt(i) == ' '){
                currpos = i;
                rsub = reverse(s.substring(prevpos,currpos));
                prevpos = i+1;
                result += rsub + ' ';
            }
        }
        return result;
    }

    public static String reverse(String s){
        char ch;
        String nstr = "";
        for(int i = 0; i < s.length();i++){
            ch = s.charAt(i);
            nstr = ch+nstr;
        }
        return nstr;
    }
}
