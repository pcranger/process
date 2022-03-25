package java_lang.Explore.array_and_string.IntroString;
//failed some test cases
public class ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "aaaaa", needle = "bba";
        System.out.println(getImplementstrStr(haystack,needle));
    }
    public static int getImplementstrStr(String haystack, String needle) {
        if(needle.equals("")) return 0;

        int i = 0;
        int j = 0;
        int offset = 0;
        while(i <= haystack.length()){
            if(j == needle.length()){
                return i - offset;
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                if(i == haystack.length()-1 && i ==j){
                    return 0;
                }
                offset++;
                i++;
                j++;
            } else{
                i++;
            }
        }

        return -1;
    }

}
