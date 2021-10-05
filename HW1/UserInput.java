package HW1;

import java.util.Scanner;

public class UserInput {
    //initiante scanner with system in. 
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Hello what is your Name, Age, and Favorite Color? ");
        String name = keyboard.nextLine();
        System.out.println("Hello, "+ name + " Its nice to meet you");
        
//Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"

    }


}

