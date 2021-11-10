import java.util.Scanner;

public class MathGame {

    public static void main(String[] args) {

        //Memu:

        System.out.println("Welcome to Math Games! \nPlease Select from the following:");

        System.out.println("1- Hypotenuse Calculator.");

        System.out.println("2- Grade Calculator.");

        System.out.println("3- Tip Calculator And Bill Splitter.");

        System.out.println("4- Exit");

        Scanner sc = new Scanner(System.in);

        System.out.println("Select \"1\", \"2\",\"3\" or \"4\"");

        int menu = sc.nextInt();

        while (menu != 4) {

            if (menu < 1 || menu > 3) {

                System.out.println("Select \"1\", \"2\",\"3\" or \"4\"");

                menu = sc.nextInt();
            }

            else if(menu == 1){
                //Pythagorean Theorem 
                String trianglePythagorean = Triangle.Pythagorean();

                System.out.println(trianglePythagorean);
            }
            
            else if(menu == 2){
                //Grading 
                String gradingGrades = Grading.Grades();

                System.out.println(gradingGrades);
            }
            
            else if(menu == 3){
                //Tip + Bill 
                String tipCalculator = Tips.Bill();

                System.out.println(tipCalculator);
            }
            else if(menu == 4){

                System.exit(4);
            }
            
        }
        
    }
    
}
