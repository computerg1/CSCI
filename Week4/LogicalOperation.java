package Week4;

import java.util.Scanner;

public class LogicalOperation {
    // Logical Opertators are used to connect two or more expressions or statements
    // && = AND - BOTH conditions are true
    // || = OR - EITHER conditions are true
    // ! = NOT - reverse boolean value

    //



        // // nested if statment
        // else if(temp>=30){
        //     if(temp<=70){
        //         System.out.println("You will need a light jacket");
        //     }
        //     else{
        //         System.out.println("You need a heavy jacket");
        //     }
        // }
    public static void main(String[] args) {
        int temp = 40;
        boolean rain = true;
        // != does not equal

        if(temp>70 && rain !=true){
            System.out.println("You do not need a jacket");
        }
        // AND STATEMENT
        else if(temp>=30 && temp <=70 && rain != true){
            System.out.println("You will need a light jacket");
        }
        else{
            System.out.println("You need a heavy jacket or it is raining");
        }


    }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     // PIPE '|' 
    //     // BANG '!'
    //     System.out.println("Please select menu option. Press q or Q to quit");
    //     String answer = scanner.nextLine();
    //     if(answer.equals("q") || answer.equals("Q")){
    //         System.out.println("Quit Successful...");
    //     }
    //     else{
    //         System.out.println("Selection not valid");
    //     }
    // }


    
}
