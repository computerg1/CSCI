

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class BankAccount {
	private double balance;

	public BankAccount(){
		balance = 0;
	}

	public BankAccount(double initalBalance) {
		balance = initalBalance;
	}

	public void deposit(double amount){
		balance = balance + amount;
	}
	public void withdraw(double amount){
		balance = balance - amount;
	}
	public double getBalance(){
		return balance;
	}
	public void monthlyFee(){
		withdraw(10);
	}
	// P (1 + R/n)^(nt) - P
	// P = principal
	// t = years
	// r = annual interest rate
	// n = # of times its compounded
	// PEMDAS
	public void calcInterest(double p, int t, double r, int n){
		double amount = p * Math.pow(1 + (r / n), n*t);
		double compinterest = amount - p;
		System.out.println("Compound Interest after "+ t + " years: "+ compinterest);
		System.out.println("Amount after "+ t + " years: "+ amount);
	}

	public void investment(double balance, double r, double targetBalance){
		int year = 0; 
		while(balance<= targetBalance){
			year++;
			double interest = balance * r / 100;
			balance = balance + interest;
		}
		System.out.println("Total Balance: $"+ balance);
		System.out.println("Investment doubled After "+ year + " years.");
	}

	//Overdraft

	public static void Overdraft(BankAccount account, double amount){

		Scanner input = new Scanner(System.in); 

		if (account.balance <= 0){ // checking if the acct balance is less than or equil to 0.

			System.out.println("Yopu have a Negative Balance, Would you liek to make a Deposit? (Y/N)"); //asking the user if they want to make a deposit. 

			String answer = input.nextLine(); 

			if (answer.equalsIgnoreCase("Y")){ //if the user answers "Y" call the deposit method. 

				account.withdraw(amount);

			}

			account.balance = account.balance - 35; //charged the 35 dollar with drawl fee. 

		} else{

			if(account.balance - amount < 0){ //checking to see if the balance becomes negative after the withdraw. 

				System.out.println("Your account balance will be Negative after this withdraw.");

				System.out.println("Contiune? (Y/N)");

				String answer =  input.nextLine(); 

				if(answer.equalsIgnoreCase("Y")){ //if the answer "Y" call the withdraw method. 

					account.withdraw(amount);

				}


			} else{

				account.withdraw(amount); //if the acct is positive... then withdraw the amount. 

			}


		}

		System.out.println("Withdrawal Complete.");

		System.out.println("New Balance: $" + account.balance);

	}


	//transfer 

	public static void Transfer(BankAccount account1, BankAccount account2, double amount){

		account1.withdraw(amount); //Deduct the amount from account1

		System.out.println("Transferring $" + amount + "from" + account1.getBalance() + "to" + account2.getBalance());


		account2.deposit(amount); //add the amount to account2

		System.out.println("Amount transferred, Balance in account2: " + account2.getBalance());

	}


	//simple intrest

	public static double SimpleInterest(double principal, double rate, int years){

		double simpleInterest = principal * rate * years / 100.0; //compute simple interest

		System.out.println("Simple Interest: $" + simpleInterest); //result 

		return simpleInterest;

	}


	//Compound Interest

	public static double CompoundInterest(double principal, double rate, int years){

		double compoundInterest = principal * Math.pow(1 + (rate / 100), years); //compute compound interest

		compoundInterest = compoundInterest - principal; 

		System.out.println("Compound Interest: $" + compoundInterest); //result 

		return compoundInterest; 

	}

	//Savings Acct

	public static BankAccount create(){

		Scanner input = new Scanner(System.in); 

		double initBalance, principal, rate = 0.0, interestAmount = 0.0; 

		int years; 

		System.out.println("Enter initial balance[Must be greater than $1,000]: ");

		initBalance = Double.parseDouble(input.nextLine()); 

		if(initBalance < 1000){

			System.out.println("initial balance must be greater than $1,000");

			return null; 

		}

		BankAccount account = new BankAccount(initBalance); 

		//selection on compound or simple intrest

		System.out.println("1. Compound Interest\n 2. Simple Interest\n Enter Selection: ");

		int selection = Integer.parseInt(input.nextLine()); 

		if(selection == 1){

			rate = 0.0001; 

		} else if(selection == 2){

			rate = 0.01;

		} else{

			System.out.println("invalid selection");

			return null; 

		}

		//asking the user required info (principle, years)

		//getting the principal and years. 

		System.out.println("Enter principal: ");

		principal = Double.parseDouble(input.nextLine()); 

		System.out.println("Enter years: ");

		years = Integer.parseInt(input.nextLine()); 

		if(selection == 1 && years < 4){

			System.out.println("Years must be greater than 4");

			return null; 

		}

		//compute Interest

		if(selection == 1){

			interestAmount = CompoundInterest(principal, rate, years);

		} else if(selection == 2){ 

			interestAmount = SimpleInterest(principal, rate, years); 

		}

		account.balance += interestAmount; //add interest to account balance

		return account; 

	}

	public static void prompt(){

		BankAccount account = create(); 

		if(account == null){

			return; 

		}

	}

	Scanner input = new Scanner(System.in); 

	public static void menu(BankAccount account) {

		int selection;
		
		Scanner input = new Scanner(System.in);

		while(true) {
			
			/*******************************************/
			System.out.println("Please select an option:");
			System.out.println("------------------------\n");
			System.out.println("1: Get Balance");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw");
		    System.out.println("4: Transfer");
	        System.out.println("5: Investment");
			System.out.println("0: Quit");
			System.out.println("------------------------\n");
	
			selection = input.nextInt();
	
			if(selection == 1){
	
			//transfer
	
			System.out.println("Enter amount to transfer: ");
	
			double amount = Double.parseDouble(input.nextLine()); 
				
			System.out.println("Enter Account Number: ");
	
			int accountNumber = Integer.parseInt(input.nextLine()); 
	
			BankAccount account2 = new BankAccount(accountNumber); 
	
			Transfer(account, account2, amount); 
	
			} else if(selection == 2){
	
				//overdraft
	
				System.out.println("Enter amount to withdraw: ");
	
				double amount = Double.parseDouble(input.nextLine()); 
	
				Overdraft(account, amount); 
	
			} else if(selection ==3){
	
				//inestment
	
				System.out.println("Enter amount to invest: ");
	
				double amount = Double.parseDouble(input.nextLine()); 
	
				System.out.println("Enter Target Balance: ");
	
				double targetBalance = Double.parseDouble(input.nextLine()); 
	
				account.investment(amount, 0.001, targetBalance); 
	
			} else if (selection == 4){
					
				//quit 
	
				break; 
	
			} else {
	
				System.out.println("invalid Selection");
			}
			
		}

	}
		
}







