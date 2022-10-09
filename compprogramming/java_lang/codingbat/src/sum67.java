public class sum67 {
    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
    }
    public static int sum67(int[] nums) {
        int sum = 0;
        boolean inRange = false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 6)
                inRange = true;

            if(!inRange)
                sum += nums[i];

            if(inRange && nums[i] == 7)
                inRange = false;

        }

        return sum;
    }
}
