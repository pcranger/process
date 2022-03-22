package java_lang.leetcode_problems.patterns.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,3,7,4,8};
        int target = 7;
        int[] result = getTwoSum(numbers, target);
        System.out.println();


    }
    public static int[] getTwoSum(int[] numbers,int target){

        Map<Integer,Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int delta = target - numbers[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[]{i, visitedNumbers.get(delta)};
            }
            //hashmap: key is the number in numbers, value is the index in numbers
            visitedNumbers.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}
