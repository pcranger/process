package java_lang.leetcode_problems.unsorted.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        System.out.print(findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},"abb"));
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        String word = "";
        List<String> result = new ArrayList<>();
        for(int i = 0; i< words.length; i++){
            word = words[i];
            HashMap<Character,Character> map = new HashMap<Character,Character>();
            boolean flag = true;
            for(int j = 0; j < word.length(); j++){
                Character patternchar = pattern.charAt(j);//c
                Character wordchar = word.charAt(j);//b
                Character prevvalue = map.get(patternchar);//null

                if(prevvalue == wordchar ){
                    map.put(patternchar,wordchar);
                }else if(prevvalue == null){
                    if(map.containsValue(wordchar)){
                        flag = false;
                    }
                    else{
                        map.put(patternchar,wordchar);
                    }
                }
                else flag = false;
            }
            if(flag){
                result.add(word);
            }
        }
        return result;
    }
}
