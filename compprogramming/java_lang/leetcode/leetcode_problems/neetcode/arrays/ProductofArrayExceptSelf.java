package java_lang.leetcode_problems.neetcode.arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf3(nums)));
    }

    //https://youtu.be/bNvIQI2wAjk

    //neetcode 1st approach
    public static int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int pr=1;
        int po=1;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
        for(int i=0;i<n;i++)
        {
            prefix[i] = nums[i]*pr;
            postfix[n-1-i]=nums[n-1-i]*po;
            pr=prefix[i];
            po =postfix[n-1-i];
        }
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
                nums[i]=prefix[i-1];
            else if(i==0)
                nums[i]=postfix[i+1];
            else
                nums[i] = postfix[i+1]*prefix[i-1];
        }
        return nums;

    }
    //neetcode 2nd approach
    public static int[] productExceptSelf3(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < right.length; i++) {
            left[i] = left[i] * right[i];
        }
        return left;
    }

    //naive approach
    public static int[] productExceptSelf2(int[] nums) { //time limit exceeded
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                product *= nums[j];
            }
            result[i] = product;
        }
        return result;
    }
}
