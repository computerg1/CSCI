package Week4;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//         next() can read the input only till the space.  It can't read two words separated by space. Also, next() places the cursor in the same line after reading the input.

// nextLine() reads input including space between the words (that is, it reads till the end of line \n).
        // Get names 
        System.out.println("Enter your First name");
        String first = in.next();
        System.out.println("Enter SO First name");
        String seccond = in.next();

        // compute initials

        String initials = first.substring(0,1) + " & " + seccond.substring(0,1) + " <3";
        System.out.println(initials);

        System.out.println(first.substring(1));
        String last = first.substring(first.length() - 1);
        System.out.println(last);

    }
    
}
