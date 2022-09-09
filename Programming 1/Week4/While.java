package Week4;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        // while loop - executes a block of code as long as the condition remains true

        Scanner keyboard = new Scanner(System.in);
        String name = "";

        String pill = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = keyboard.nextLine();
        }
        System.out.println("Hello "+name);

        // Standard if else 
        // System.out.println("What will your choice be Red or Blue?");
        // pill = keyboard.nextLine();
        // if (!pill.equals("Red")){
        //     System.out.println("Have a nice life");
        // } else{
        //     System.out.println("Welcome to the Matrix!");
        // }
        // With while loop
        // While will only run if condition is true 
        while (!pill.equals("Red")){
            System.out.println("What will your choice be Red or Blue?");
            pill = keyboard.nextLine();
        }
        System.out.println("Welcome to the matrix!");
        // Will always run the do first atleast once 
        int i=1;    
        do{    
            System.out.println(i);    
        i++;    
        }while(i<=10);    

        // the delema
        // infinite loops
        
        // while(true){
        //     System.out.println("INFINITE");
        // }

    }
    
}
