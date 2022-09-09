package Week4;

import java.util.Scanner;

public class LogicalOperation {

    // Logical Operators are used to connect two or more expressions or statements
    // && = AND - BOTH conditions must be true
    // || = OR - EITHER conditions must be true
    // ! = NOT - reverses boolean value

    // example

    public static void main(String[] args) {
        int temp = 40;
    
        if(temp>70) {
            System.out.println("You do not need a jacket");
        }
        else if(temp>=30){
            if (temp<=70){
                System.out.println("You need a light jacket");
            }
            else {
                System.out.println("You need a heavy jacket");
            }
        }
        else {
            System.out.println("You need a heavy jacket");
        }

        // There is a better way to write this





        // AND
        // int temp = 80;
    
        // if(temp>70) {
        //     System.out.println("You do not need a jacket");
        // }
        // else if(temp>=30 && temp<=70){
        //     System.out.println("You need a light jacket");
        // }
        // else {
        //     System.out.println("You need a heavy jacket");
        // }
        
        // OR
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Please select menu option. Press q or Q to quit");
        // String answer = scanner.nextLine();
        
        // if(answer.equals("q") || answer.equals("Q")){
        //     System.out.println("Quit Successful..");
        // }
        // else {
        //     System.out.println("Selection not valid");
        // }
    




        // NOT
        // int temp = 80;
        // boolean rain = false;
    
        // if(temp>70 && rain != true) {
        //     System.out.println("You do not need a jacket");
        // }
        // else if(temp>=30 && temp<=70 && rain != true){
        //     System.out.println("You need a light jacket");
        // }
        // else {
        //     System.out.println("You need a heavy jacket or it is raining");
        // }
        

    }
}
