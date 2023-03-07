package tekosampletest3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for(int j = 0; j< t; j++){
            String keyboard = scan.nextLine();
            String word = scan.nextLine();

            int r = 0;

            ArrayList<Character> arr = new ArrayList<Character>();

            for(int i = 0; i< keyboard.length(); i++){
                char c = keyboard.charAt(i);
                arr.add(c);
            }

            int prev = arr.indexOf(word.charAt(0)) + 1;
            int dist = 0;
            for(int i = 1; i< word.length();i++){
                char c = word.charAt(i);
                int in = arr.indexOf(c);
                in ++;
                dist = Math.abs(in - prev);
                r +=dist;
                prev = in;
            }


            System.out.println(r);
        }


    }
}
