package java_lang.leetcode_patterns.easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static List<Integer> FindAllNumbersDisappearedinanArray(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result= new ArrayList<Integer>();

        //Put all elements in a set, it automatically removes duplicate elements
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        //set = {1,2,3,4,7,8}

        //j iterates in [1,n], check if it matches any element in the list, if not, add that element to the result list
        for(int j = 1; j <= nums.length; j ++){
            if(!set.contains(j)){
                result.add(j);
            }
        }
        return result;
        //this is O(n^2), since .contains creates another loop for the set
    }

    public static void main(String[] args) {
        List<Integer> result = FindAllNumbersDisappearedinanArray(new int[]{1, 1});
        for(int i : result){
            System.out.println(i);
        }
    }
}
