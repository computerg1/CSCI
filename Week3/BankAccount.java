package Week3;
import java.util.Scanner;

public class BankAccount {
    // Make it private because we dont want people to be able to see account balances 
    private double balance;


    public BankAccount() {
        balance = 0;
    }

    
    public BankAccount(double initalBalance){
        balance = initalBalance;
        // this.balance = InitialBalance;
    }
    // Deposit Money into Bank
    // implicit parameter vs explicit parameters 
    // amount is the explicit parameter
    // BankAccount is the implicit parameter
    public void deposit(double amount){
        balance = balance + amount;
        // this.balance = this.balance + amount
        // this is used to help denote the implicit parameter 
    }
    // Withdraw Money from Bank
    public void withdraw(double amount){
        balance = balance - amount;
    }
    // Get current balance of the Account
    public double getBalance(){
        return balance;
    }
    // public BankAccount(double balance){
    //     this.balance = balance;
    // }
    public void monthlyFee(){
        withdraw(10);
    }
    // transfer
    // p = principal
    // t = years 
    // r = annuial interest rate 8/100 0.08 
    // n = number of times interest is compounded 
    //P (1 + R/n)^(nt) - P

    public void calcInterest(double p, int t, double r, int n){
        double amount = p * Math.pow(1 + (r / n), n * t);
        double compinterest = amount - p;
        //compinterest = Math.round(compinterest);
        System.out.println("Compound Interest after " + t + " years: "+ compinterest);
        System.out.println("Amount after " + t + " years: "+ amount);

    }
    
    public void investment(double balance, double r, double targetBalance){
        int year = 0;
        while(balance < targetBalance){
            year++;
            double interest = balance * r / 100;
            balance = balance + interest;
            System.out.println("year " + year +" $"+ balance);
        }
        System.out.println("Total Balance: $"+ balance);
        System.out.println("Investment doubled After "+ year + " years.");
    }

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Please Select an option:");
        System.out.println("-------------------------\n");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("0: Quit");

        selection = input.nextInt();
        return selection;    
    }

}
