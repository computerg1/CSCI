package HW1;

import java.util.Scanner; 

public class Main {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        Pyramid p = new Pyramid(); //new Pyramid object 

        p.Output(); // taking the Pyramid object and calling the method. 

        System.out.println("Name:  ");   //system prints out name:

        String name = keyboard.nextLine(); //user inputs name:

        System.out.println("Favorite Color: ");  // system prints out favorite color

        String favoriteColor = keyboard.nextLine();

        System.out.println("Age: ");    //system prints out Age:

        int age = keyboard.nextInt(); //user inputs age:

        //Pyramid.output(); can be used as well to copy more times. 



        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        Adlibs2 s = new Adlibs2();

         String answer = s.story(name, age, favoriteColor);

         System.out.println(answer);




        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        
        String test = "I MAKE BREAD";
        Replace testString = new Replace();
        System.out.println(testString.charReplace(test, 2,'T'));

    }
}
