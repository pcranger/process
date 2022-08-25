package java_lang.leetcode_problems.patterns.two_pointers;

import java.util.Arrays;

public class TwoSum2Pointers {
    public static void main(String[] args) {
        int[] numbers = new int[]{3,2,4};
        int target = 6;
        int[] result = getTwoSum(numbers, target);
        System.out.println(Arrays.toString(Arrays.stream(result).toArray()));


    }
    public static int[] getTwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] + nums[right] == target){
                return new int[]{left, right};
            }
            if(nums[left] + nums[right] > target) right --;
            else left++;
        }
        return new int[]{0,0};
    }
}
