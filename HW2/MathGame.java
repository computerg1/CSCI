import java.util.Scanner;
//This is my attempt at having a cool menu driven looptastic program.
public class MathGame {

    public static void main(String[] args) {

        //Memu:

        System.out.println("Welcome to Math Games! \nPlease Select from the following:");
        System.out.println("1- Hypotenuse Calculator.");
        System.out.println("2- Grade Calculator.");
        System.out.println("3- Tip Calculator And Bill Splitter.");
        System.out.println("4- Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select \"1\", \"2\", or \"3\"");
        int menu = sc.nextInt();
        while (menu != 4) {
            if (menu < 1 || menu > 3) {
                System.out.println("Select \"1\", \"2\", or \"3\"");
                menu = sc.nextInt();
            }

            else if(menu == 1){
                //Pythagorean Theorem Object
                String trianglePythagorean = Triangle.Pythagorean();
                System.out.println(trianglePythagorean);
            }
            
            else if(menu == 2){
                //Grading Object
                String gradingGrades = Grading.Grades();
                System.out.println(gradingGrades);
            }
            
            else if(menu == 3){
                //Tip + Bill Object
                String tipCalculator = Tips.Bill();
                System.out.println(tipCalculator);
            }
            else if(menu == 4){
                System.exit(4);
            }
            
        }
        //close all scanners in each object??
        sc.close();
    }
    
}
