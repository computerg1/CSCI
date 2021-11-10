import java.util.Scanner;

public class Tips {

    public static String Bill() {
        
        Scanner sc = new Scanner(System.in);
        double bill, percent, tip;
        int people, total, split;
       
        System.out.println("Welcome to the Tip Calculator!\n");
        System.out.println("Amount of Poeple: ");
            people = sc.nextInt();
        System.out.println("Cost: "); bill =  sc.nextDouble();
            
        System.out.println("Tip... Please enter as a decimal for percent: ");
            percent = sc.nextDouble();
            tip = (bill * percent);
            total = (int) (bill + tip);
        System.out.println("The total comes to $" + total);
        split = (int) (total/people);
        System.out.println("If you split the bill it would cost \n $" + split + " each.");

        return null;

    }

}

