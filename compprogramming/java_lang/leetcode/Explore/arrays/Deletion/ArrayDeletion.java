package java_lang.Explore.arrays.Deletion;

import java.util.Arrays;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        int[] result = getArrayDeletion(arr,3);
        System.out.println(Arrays.toString(result));
    }


    public static int[] getArrayDeletion(int[] my_array,  int Index_position) {
        int[] result = new int[my_array.length - 1];
        for (int i = my_array.length; i > Index_position; i--) {
            result[i - 2] = my_array[i - 1];
        }


        for (int i = Index_position - 1; i >= 0; i--) {
            result[i] = my_array[i];
        }
        return result;
    }
}
