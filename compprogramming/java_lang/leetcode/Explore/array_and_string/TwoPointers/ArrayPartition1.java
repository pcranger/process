package java_lang.Explore.array_and_string.TwoPointers;

import java.util.Arrays;

public class ArrayPartition1 {
    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i+=2){
            sum+=nums[i];
        }
        return sum;

    }
}
