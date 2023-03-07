package tekosampletest2;

// Java implementation for the above approach
import java.io.*;
import java.util.*;

class GoodPassword {


    public static void printStrongNess(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        // Strength of password
        if (hasDigit && hasLower && hasUpper && specialChar
                && (n >= 8))
            System.out.print("YES");
            // else if ((hasLower || hasUpper || specialChar)
            // 		&& (n >= 6))
            // 	System.out.print(" Moderate");
        else
            System.out.print(" NO");
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        printStrongNess(input);
    }


}
// contributed by Ashish Chhabra

