import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Problem11 {
    public static boolean containsDuplicateString(String str) {
        if (str.length() > 128)
            return false;
        //this is a dicionary, contains all possible distinct element inside string, use this dictionary to search within string
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {    //if character is found
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    /*hello*/
    public static boolean containsDuplicateInt(int[] nums) {
        HashSet<Integer> dict= new HashSet<Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(dict.contains(nums[i])){
                return false;
            }
            dict.add(nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicateInt(new int[]{1, 2, 3,1}));
    }
}