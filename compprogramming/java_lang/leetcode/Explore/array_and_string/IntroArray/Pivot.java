package java_lang.Explore.array_and_string.IntroArray;

public class Pivot {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,-1,-1,-1,-1};
        System.out.println(getpivot(nums));
    }
//only works with absolute integer array
    public static int getpivot(int[] nums) {

        int left = 0;
        int right = 0;

        //to catch case where total right sum(excluding first index) = 0
        for (int i = nums.length - 1; i > 0; i--) {
            right += nums[i];
        }
        if (right == 0) {
            return 0;
        }
        //to catch case where total left sum(excluding last index) = 0
        for (int i = 0; i <= nums.length - 2; i++) {
            left += nums[i];
        }
        if (left == 0) {
            return nums.length - 1;
        }


        left = nums[0];
        right = nums[nums.length - 1];
        int i = 0;
        int j = nums.length - 1;

        while (j >= i + 2) {

            if (left > right) {
                right += nums[j - 1];
                j--;
            } else if (left < right) {
                left += nums[i + 1];
                i++;
            } else {//left = right
                if (j - i == 2) {//if there is an index in between
                    return i + 1;
                }
            }


        }
        return -1;
    }
}
