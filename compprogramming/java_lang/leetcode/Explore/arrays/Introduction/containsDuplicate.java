package java_lang.Explore.arrays.Introduction;

import java.util.HashSet;

public class containsDuplicate {
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
