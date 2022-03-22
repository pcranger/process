package java_lang.leetcode_patterns.easy.arrays;

import java.util.Arrays;

public class MergeSortedArraySol {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] res = getMergeSortedArray(nums1,nums2,m,n );
        System.out.println(Arrays.toString(res));
    }
    public static int[] getMergeSortedArray (int[] nums1, int[] nums2, int m, int n){
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
        return nums1;
    }
}
