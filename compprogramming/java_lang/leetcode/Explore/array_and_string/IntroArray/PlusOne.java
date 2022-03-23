package java_lang.Explore.array_and_string.IntroArray;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(getlargestNumberTwice(nums)));
    }

    private static int[] getlargestNumberTwice(int[] digits) {
        int i = digits.length -1 ;
        while(digits[i] == 9){
            digits[i] = 0;
            if(i == 0){
                int[] newarr = new int[digits.length+1];
                newarr[0] = 1;
                for(int j = 1; j< newarr.length -1; j++ ){
                    newarr[j] = 0;
                }

                return newarr;
            }
            i--;
        }
        digits[i] +=1;
        return digits;

    }
}
