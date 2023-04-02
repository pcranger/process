package java_lang.leetcode_problems.neetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    //my accepted solution
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int max = 0;
        int count = 0;
        int prev = 0;
        int curr = 0;
        for(int i = 1; i < nums.length; i++){
            curr = nums[i];
            prev = nums[i-1];
            if(curr == prev+1) count +=1;
            else if(curr == prev)continue;
            else{
                count = 0;
            }
            if(count > max) max = count;


        }
        max +=1;
        return max;
    }

    public static int longestConsecutiveHashSet(int[] nums) {
        if(nums.length==0) return 0;
        int length=1;
        int maxLength=1;
        //use hashset so no duplicates
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for (int i=0; i<nums.length; i++){
            if(set.remove(nums[i])){
                length=1;
                int left=nums[i]-1;
                int right=nums[i]+1;

                while (set.remove(left)){
                    length++;
                    left-=1;
                }
                while (set.remove(right)){
                    length++;
                    right+=1;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}
