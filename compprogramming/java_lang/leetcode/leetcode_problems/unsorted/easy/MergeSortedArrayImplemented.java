package java_lang.leetcode_problems.unsorted.easy;

import java.util.Arrays;

public class MergeSortedArrayImplemented {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 6};
        int m = 4;
        int[] nums2 = {2, 4, 7};
        int n = 3;
        int[] res = getMergeSortedArray(nums1,nums2,m,n );
        System.out.println(Arrays.toString(res));
    }
    public static int[] getMergeSortedArray (int[] nums1, int[] nums2, int m, int n){
        int[] result = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
                k++;
            }
            else{
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i < m) {
            result[k++] = nums1[i++];
        }
        // This is the case when array A all elements processed and B has still unvisited elements
        while (j < n) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}
