package java_lang.Explore.array_and_string.TwoPointers;
public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        getReverseString(s);
    }
    public static void getReverseString(char[] s){

        int i = 0;
        int j = s.length-1;
        while(i< j){
            char temp = ' ';
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++; j--;
        }


        for(char t : s){
            System.out.println(t);
        }
    }
}
