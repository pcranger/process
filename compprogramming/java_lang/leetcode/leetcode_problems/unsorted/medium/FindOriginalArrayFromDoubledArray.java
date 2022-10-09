package java_lang.leetcode_problems.unsorted.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindOriginalArrayFromDoubledArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findOriginalArray(new int[]{1, 3, 4, 2, 6, 8})));
    }
    public static int[] findOriginalArray(int[] changed) {
        int[] temp = new int[changed.length/2];
        Queue<Integer> x = new LinkedList<>();
        Arrays.sort(changed);
        int i = 0;
        for(int num : changed){
            if(!x.isEmpty() && x.peek()==num)
                temp[i++] = x.poll()/2;
            else x.add(num*2);
        }
        return x.size()>0 ? new int[]{}:temp;
    }
}
