package Week6;

import java.util.Scanner;

public class arrays {
    // arrays are used to store multiple values in a single variable
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
            
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                            + anArray[0]);
        System.out.println("Element at index 1: "
                            + anArray[1]);
        System.out.println("Element at index 2: "
                            + anArray[2]);
        System.out.println("Element at index 3: "
                            + anArray[3]);
        System.out.println("Element at index 4: "
                            + anArray[4]);
        System.out.println("Element at index 5: "
                            + anArray[5]);
        System.out.println("Element at index 6: "
                            + anArray[6]);
        System.out.println("Element at index 7: "
                            + anArray[7]);
        System.out.println("Element at index 8: "
                            + anArray[8]);
        System.out.println("Element at index 9: "
                            + anArray[9]);

        int[] shortArray = { 
        1, 2, 3,
        4, 5, 6, 
        7, 8, 9, 10
        };
        for (int i : shortArray) {
            System.out.println(i);
        }

        String[] names = {"Appa","Momo","Jack"};
        System.out.println(names[0]);

        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //What if we dont know the information yet?
        String[] namesunkown = new String[20];
        namesunkown[0] = "Greg";
        namesunkown[1] = "George";
        System.out.println(namesunkown[0]);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter word");
        String str = keyboard.next();

  
        // Creating array of string length
        char[] ch = new char[str.length()];
  
        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
  
        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }

    }
}
