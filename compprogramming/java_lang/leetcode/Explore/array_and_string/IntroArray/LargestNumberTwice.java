package java_lang.Explore.array_and_string.IntroArray;

import java.util.*;

public class LargestNumberTwice {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println(getlargestNumberTwice(nums));
    }
    public static int getlargestNumberTwice(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums) {
            list.add(i);
        }

        Arrays.sort(nums);
        int max = nums[nums.length - 1];

        for (int i = 0; i <= nums.length - 2; i++) {
            if (max < nums[i] * 2) {
                return -1;
            }
        }
        return list.indexOf(max);
    }
}
