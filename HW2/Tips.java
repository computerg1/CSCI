import java.util.Scanner;

public class Tips {

    public static String Billing() {
        
        Scanner bills = new Scanner(System.in);

        double bill, percent, tip;
        
        int people, total, split;
       
        System.out.println("Welcome to the Tip Calculator!\n");

        System.out.println("Amount of Poeple: ");

            people = bills.nextInt();

        System.out.println();

        System.out.println("Cost: "); 

        bill =  bills.nextDouble();

        System.out.println();

        System.out.println("Tip... Please enter as a decimal for percent: ");

            percent = bills.nextDouble();

            tip = (bill * percent);

            total = (int) (bill + tip);

            System.out.println();

        System.out.println("The total comes to $" + total);

        split = (int) (total/people);

        System.out.println();

        System.out.println("If you split the bill it would cost \n $" + split + " each.");
        
        return "";

    }

}

