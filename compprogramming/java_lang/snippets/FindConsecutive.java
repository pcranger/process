package java_lang.snippets;



public class FindConsecutive {

    public static void main(String[] args) {

        int[] nums = { 16, 4, 5, 200, 6, 7, 9, 8 };
        int counter = 0;
        for (int i = 1; i < nums.length; i++) { //start from second number
            if (nums[i - 1] == nums[i] - 1) {   //if previsous number equals to current number -1
                counter += 2;   // there are 2 consecutive numbers
                int j = i + 1;  //int[j] is next number
                while (j < nums.length && nums[j] - 1 == nums[j - 1]) {// while next number digit < array length AND next number - 1 equals to current number
                    j++;
                    counter++;
                }
                i = j;
            }
        }
        System.out.print("Consective amount is " + counter);
    }

}