package tekosampletest1;

import java.util.*;

public class Seniority {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] copy = intArray.clone();

        Arrays.sort(copy);

        for (int i = 0; i < intArray.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        for (int i = 0; i < intArray.length; i++) {
            copy[i] = map.get(intArray[i]);
        }
        String result = "";
        for(int i = 0; i< copy.length; i++){
            result += copy[i] + " ";
        }
        System.out.println(result);

    }
}
