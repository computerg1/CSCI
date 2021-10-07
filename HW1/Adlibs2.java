package HW1;

import java.util.Scanner;   //imported scanner 

public class Adlibs2 {    // made a class 
    //initiante scanner with system in. 
    static Scanner keyboard = new Scanner(System.in); // assigned "keyboard" to the scanner 
    public static void main(String[] args) {   // main runner. 
        
       System.out.println("Name:  ");   //system prints out name:

        String Name = keyboard.nextLine(); //user inputs name:
        
        System.out.println("Age: ");    //system prints out Age:

        String Age = keyboard.nextLine(); //user inputs age:
        
        System.out.println("Favorite Color: ");  // system prints out favorite color

        String favoriteColor = keyboard.nextLine(); // user inputs favorite color

        System.out.println("Hello: " + Name); //system prints out inputed info 

        System.out.println("Your Age is:" + Age); //system prints out inputed info 
        
        System.out.println("Your favorite color is:" + favoriteColor); //system prints out inputed info 
        
//Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
    }


}



