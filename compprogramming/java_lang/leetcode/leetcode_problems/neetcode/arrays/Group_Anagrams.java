package java_lang.leetcode_problems.neetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for(int i = 0; i< strs.length; i++) {
            String temp = strs[i];
            char[] tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            String sorted = new String(tempArray);
            if (!map.containsKey(sorted)) {
                List<String> newarr = new ArrayList<>();
                newarr.add(temp);
                map.put(sorted, newarr);
            }else
            map.get(sorted).add(temp);
        }
        lists = new ArrayList<>(map.values());
        return lists;
        }
    public List<List<String>> groupAnagramsCharFrequency(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
    }

