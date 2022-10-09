package tekosampletest3;

import java.util.*;

public class Radio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        String s = scan.nextLine();

        String[] s1 =  s.split(" ");

        ArrayList<String> arr = new ArrayList();

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");


        for(int i = 0; i< n; i++){
            int pos = Integer.parseInt(s1[i]);
            if(pos == 1){
                arr.add(arr.get(0));
                arr.remove(arr.get(0));
            }
            if(pos == 2){
                arr.add(0,arr.get(arr.size()-1));
                arr.remove((arr.size()-1));
            }
            if(pos == 3){
                String first = arr.get(0);
                String second = arr.get(1);
                String temp = first;
                first = second;
                second = temp;
                arr.remove(0);
                arr.remove(0);
                arr.add(0,second);
                arr.add(0,first);

            }
            if(pos == 4){
                String result = "";
                for(String t : arr){
                    result += t + " ";
                }
                System.out.println(result);
            }
        }

    }
}
