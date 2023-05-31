package java_lang.thebrownbox.array;

/**
 * @author hieutm
 * 5/29/2023
 * 3:37 PM
 */
public class _387_FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        //build the character counter array
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            count[c] += 1;
        }
        //loop over string array, find out which element has appeared only once
        for(int j = 0; j < arr.length; j++){
            char c = arr[j];
            int index = (int) c;
            if(count[index] == 1) return j;
        }
        return -1;
    }
}
