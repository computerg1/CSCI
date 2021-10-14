package Week5;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
      // while loop - executes a block of code as long as the condition remains true
      
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String pill = "";

    // create while loop
    //   while(name.isBlank()){
    //       System.out.println("Enter your name: ");
    //       name = keyboard.nextLine();
    //   }
    //   System.out.println("Hello " + name);

        // System.out.println("What will your choice be Red or Blue?");
        // pill = keyboard.nextLine();
        // String start = pill.substring(0,1);
        // start = start.toUpperCase();
        // String answer = start + pill.substring(1);
        // System.out.println(start);
        // System.out.println(answer);
        // if (!pill.equals("Red")){
        //     System.out.println("Have a nice life");
        // } else{
        //     System.out.println("Welcome to the Matrix!");

        // }
        //! = NOT
        while(!pill.equals("Red")){
            System.out.println("What will your choice be Red or Blue?");
            pill = keyboard.nextLine();
        }
        // System.out.println("Welcome to the Matrix!");
        int i = 1;
        // While loops have 2 different approaches
        // Standard While (See above)
        // Do-While
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
        





    }
        

}
