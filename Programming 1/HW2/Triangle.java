

import java.util.Scanner;

public class Triangle {

    public static String Pythagorean() {

        Scanner angle = new Scanner(System.in);

        double side1, side2, hypotenuse;

        System.out.println("Welcome to the Pythagorean Theorem Calculator!");

        System.out.println("Please Enter A Value For Side 1: "); 

        side1 = angle.nextDouble();

        System.out.println("Please Enter A Value for Side 2: ");

        side2 = angle.nextDouble();

        hypotenuse = Math.sqrt((side1*side1)+(side2*side2));

        System.out.println("The length of the Hypotenuse is: " + hypotenuse);

        return "Quick Maths";
    }
    
}
