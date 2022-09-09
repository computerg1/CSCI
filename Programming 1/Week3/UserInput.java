package Week3;

import java.util.Scanner;

public class UserInput {
    
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Hello What is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello, "+ name + " It's nice to meet you");
    }
    
}
