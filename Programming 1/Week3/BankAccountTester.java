package Week3;
import java.util.Scanner;
public class BankAccountTester {

    static Scanner keyboard = new Scanner(System.in);
    // Tests methods of BankAccount
    public static void main(String[] args) {
        // BankAccount gregChecking = new BankAccount();
        // BankAccount bobChecking = new BankAccount(10000);
        // System.out.println(gregChecking.getBalance()); 
        // System.out.println(bobChecking.getBalance());
        // gregChecking.monthlyFee();
        // bobChecking.withdraw(1000);
        // System.out.println(bobChecking.getBalance());
        // System.out.println(gregChecking.getBalance());

        // gregChecking.deposit(50000);
        // gregChecking.calcInterest(gregChecking.getBalance(), 10, 0.07, 12);




        System.out.println("Hello.. Welcome.. How much money would you like to start an account with?");
        double startingBalance = keyboard.nextDouble();
        System.out.println("Wow $"+ startingBalance + " Thats a great start.. Let me get the account started for you");
        BankAccount userBank = new BankAccount(startingBalance);
        System.out.println("Great the account is started");

        userBank.investment(startingBalance, 5, 10000);

        int menuSelection = BankAccount.menu();
        
        if (menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $" + userBank.getBalance()); 
        } else if (menuSelection == 2){
            System.out.println("Please enter the amount to Deposit:");
            double depositAmount = keyboard.nextDouble();
            userBank.deposit(depositAmount);
            System.out.println("Amount: $" + depositAmount +" Was deposited");
            System.out.println("Total Balance: $" + userBank.getBalance());
        } else if (menuSelection == 3){
            System.out.println("Please enter the amount to Withdraw:");
            double withdrawAmount = keyboard.nextDouble();
            userBank.withdraw(withdrawAmount);
            System.out.println("Amount: $" + withdrawAmount +" Was Withdrawn");
            System.out.println("Total Balance: $" + userBank.getBalance());
        } else if (menuSelection == 0){
            System.out.println("Have a good day...");
        } else {
            System.out.println("ERROR: NO VALID SELECTION CHOOSEN");
        }
        

    }
}
