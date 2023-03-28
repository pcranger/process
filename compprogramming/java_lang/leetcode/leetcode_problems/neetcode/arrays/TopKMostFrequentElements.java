package java_lang.leetcode_problems.neetcode.arrays;

import java.util.*;

public class TopKMostFrequentElements {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); // num, freq
        for(int i : nums){
            int count = map.getOrDefault(i, 1);
            map.put(i, count + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(Map.Entry entry : map.entrySet()){
            pq.add(entry);
        }
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}
//            int key = nums[i];
//            map.putIfAbsent(key, 1);
//            map.put(key,map.get(key)+1);
