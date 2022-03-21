package java_lang.Explore.arrays.Insertion;

import java.util.Arrays;

public class arrayInsertion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int[] result = getArrayInsertion(arr, 4, 3);
        System.out.println(Arrays.toString(result));


    }

    public static int[] getArrayInsertion(int[] my_array, int newValue, int Index_position) {
        int[] result = new int[my_array.length + 1];
        for (int i = my_array.length; i > Index_position; i--) {
            result[i] = my_array[i - 1];
        }
        result[Index_position] = newValue;

        for (int i = Index_position - 1; i >= 0; i--) {
            result[i] = my_array[i];
        }
        return result;
    }
}





