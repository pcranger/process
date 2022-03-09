package java_lang.snippets;



public class isStr1CreatedFromStr2 {

    public boolean isStr1CreatedFromStr2(String str1, String str2){


        boolean creatable = false;
        str1 = str1.toLowerCase();
        int wordlength = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                char charofword = str1.charAt(i);
                char charofrow = str2.charAt(j);
                if (charofword == charofrow) { 
                    wordlength += 1; 
                } 
            }
        }
        if (wordlength == str1.length()) {
            creatable = true;
        }
        return creatable;
    }
}