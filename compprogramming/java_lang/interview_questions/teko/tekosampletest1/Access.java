package tekosampletest1;

import java.util.*;

public class Access {
    public static void main(String[] args) {
        Map<String, String> operation_permissions = new HashMap<String, String>();
        operation_permissions.put("read","R");
        operation_permissions.put("write","W");
        operation_permissions.put("execute","X");

        Scanner scan = new Scanner(System.in);
        int in1 = scan.nextInt();
        scan.nextLine();
        Map<String, ArrayList<String>> file_permissions = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i< in1; i++){
            String line = scan.nextLine();
            ArrayList<String> permissions = new ArrayList( Arrays.asList(line.split(" ")));
            String file = permissions.get(0);
            permissions.remove(0);
            file_permissions.put(file,permissions);
        }
        int in2 = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < in2; i++){
            String line = scan.nextLine();
            String[] parts = line.split(" ");
            String operation = parts[0];
            String file = parts[1];
            if(file_permissions.get(file).contains(operation_permissions.get(operation))){
                System.out.println("OK");
            }
            else{
                System.out.println("Access denied");
            }
        }
    }
}
