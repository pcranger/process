package java_lang.leetcode_problems.blind75;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1};
        System.out.println(getContainsDuplicate(nums));
    }
    public static boolean getContainsDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set.toString());

        if(set.size() - nums.length < 0) return false;
        return true;
    }
}
