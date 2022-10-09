package java_lang.leetcode_problems.unsorted.easy;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(char i : s.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i) + 1);
            }
            else map.put(i,0);
        }
        for(Character c : map.keySet()){
            if(map.get(c)== 0) return s.indexOf(c);
        }
        return -1;
    }
}
