package java_lang.thebrownbox.array;

import java.util.Arrays;

/**
 * @author hieutm
 * 5/29/2023
 * 9:29 AM
 */
public class _27_RemoveElement_2PT {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
