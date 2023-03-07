package tekosampletest1;

import java.util.*;

public class UnionArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i< t; i++){
            String size = scan.nextLine();
            String[] sizearr = size.split(" ");
            int n = Integer.parseInt(sizearr[0]);
            int m = Integer.parseInt(sizearr[1]);
            String s1 = scan.nextLine();
            Set<Integer> set = new HashSet<Integer>();
            for(String e : s1.split(" ")){
                set.add(Integer.parseInt(e));
            }
            String s2 = scan.nextLine();
            System.out.println(s2);
            for(String e : s2.split(" ")){
                set.add(Integer.parseInt(e));
            }
            List<Integer> list = new ArrayList<Integer>(set);
            Collections.sort(list);
            String result = "";
            for(Integer r : list){
                result += r + " ";
            }
            System.out.println(result);

        }

    }
}
