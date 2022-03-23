package java_lang.Explore.array_and_string.IntroArray;

public class PivotSol {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,-1,-1,-1,-1};
        System.out.println(getpivot(nums));
    }

    public static int getpivot(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;

    }
}
