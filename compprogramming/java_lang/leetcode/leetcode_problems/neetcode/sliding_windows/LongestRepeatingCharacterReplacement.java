package java_lang.leetcode_problems.neetcode.sliding_windows;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hieutm
 * 5/17/2023
 * 2:51 PM
 */
public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        //sliding windows
        //use 2 pointers i,j
        //keep hashtable number of occurence
        //while i in s.length
        //find char with most occurence
        //number to replace = windows size - char with most occurence
        //if windows not valid char to replace > k
        //j++
        //check if window is valid, if valid , res = window length
        //if reach end of length, i++
        int i = 0;
        int j = 0;
        int res = 0;
        HashMap<Character, Integer> occur = new HashMap<>();
        while(i < s.length()){
            int winSize = j - i;
            int maxOccur = Collections.max(occur.entrySet(), Map.Entry.comparingByValue()).getValue();
            int toReplace = winSize - maxOccur;
            if(toReplace <= k){
                //windows is valid
                res = winSize;
                i++;
            }


        }
    return res;
    }
}
