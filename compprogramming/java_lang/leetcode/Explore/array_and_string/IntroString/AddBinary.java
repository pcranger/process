package java_lang.Explore.array_and_string.IntroString;

import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println( getAddBinary("11",
                "1"));
    }
    public static String getAddBinary(String a, String b){
        BigInteger anum = new BigInteger(a, 2);
        BigInteger bnum = new BigInteger(b, 2);
        BigInteger sum = anum.add(bnum);
        String sumbi = sum.toString(2);
        return sumbi;
    }
}
