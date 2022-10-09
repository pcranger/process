package tekosampletest2;

import java.util.HashMap;
import java.util.Scanner;

public class FileNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i< n; i++){
            String in = scan.nextLine();
            map.put(in, map.getOrDefault(in,0) + 1);
            Integer occur = map.get(in);
            if(occur > 0){
                occur-=1;
                String in2 = in + "(" + occur + ")";
                System.out.println(in2);
                map.put(in2,map.getOrDefault(in2,0) + 1);
            }else System.out.println(in);
        }
    }
}
