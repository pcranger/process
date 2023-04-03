package java_lang.leetcode_problems.neetcode.two_pointers;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum_tp(nums, target)));
    }

    //identical to twosum
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[]{ visitedNumbers.get(delta)+1,i+1};
            }
            //hashmap: key is the number in numbers, value is the index in numbers
            visitedNumbers.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSum_tp(int[] numbers, int target) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
