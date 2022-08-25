package java_lang.leetcode_problems.unsorted.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordSubset {
    public static void main(String[] args) {
        String[] words1 = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = new String[]{"e", "o"};
        System.out.print(wordSubsets(words1, words2));
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] words2Freq = getMaxFrequencies(words2);

        //get frequencies for letters in words1 array and compare with
        //getMaxFrequencies of words2, check if it is valid
        //if yes then add it to a result list
        for(int i=0; i<words1.length; i++){
            int[] word1Freq = getFrequency(words1[i]);
            boolean flag = true;
            for(int j=0; j<26; j++){
                if(word1Freq[j] < words2Freq[j]){
                    flag = false;
                    continue;
                }
            }

            if(flag == true){
                result.add(words1[i]);
            }
        }


        return result;
    }

    //get maximum of freq of letters for all words in an array
    public static int[] getMaxFrequencies(String[] word2){
        int[] max = new int[26];
        for(int i=0; i<word2.length; i++){
            int[] wordFrequencies = getFrequency(word2[i]);

            for(int j=0; j<26; j++){
                max[j] = Math.max(max[j], wordFrequencies[j]);
            }
        }
        return max;
    }

    //get frequency of letters for a word
    public static int[] getFrequency(String s){
        int[] frequencies = new int[26];
        for(char c: s.toCharArray()){
            frequencies[c-'a']++;
        }
        return frequencies;
    }
}
