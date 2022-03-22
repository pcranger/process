package java_lang.leetcode_patterns.easy.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] res = getMergeSortedArray(nums1,nums2,m,n );
        System.out.println(Arrays.toString(res));
    }
    public static int[] getMergeSortedArray (int[] nums1, int[] nums2, int m, int n){
        int tail1 = n-1; int tail2 = m-1;int finished = m+n-1;

        //assign from bottom of final array the bigger element in each nums1 and nums2
        while (tail1 >= 0 && tail2 >= 0){
            if(nums1[tail1] > nums2[tail2]){
                nums1[finished] = nums1[tail1];
                tail1--;
                finished--;
            }
            else{
                nums1[finished] = nums2[tail2];
                tail2--;
                finished--;
            }
        }


        while (tail2 >= 0) { //when tail1 == 0, tail1-- makes it -1,the 1st loop discontinue, and this loop is here to add elements of nums2 to top in case that happens
            nums1[finished] = nums2[tail2];
            finished--;
            tail2--;
        }
        return nums1;
    }
}
