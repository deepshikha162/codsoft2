package Poject;

import java.util.Scanner;

 class ATM_Machine {
	private double balance;
	public ATM_Machine(double initialBalance){
		if (initialBalance<0) {
			this.balance=0;
		}else {
			this.balance=initialBalance;
		}
		}
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			return true;
		}
		return false;
	}
	  public boolean withdraw(double amount) {
		  if(amount>0&&amount<=balance) {
			  balance-=amount;
			  return  true;
		  }
	   return false;}}


 
 public class ATM {
 	private ATM_Machine account;
 	private Scanner scanner;

 	public ATM(ATM_Machine account) {

 		this.account = account;
 		this.scanner = new Scanner(System.in);
 	}

 	public void start() {
 		System.out.println("welcome");
 		int choice;
 		do {
 			System.out.println("Please select an option");
 			System.out.println("1.Check balance");
 			System.out.println("2.Deposit");
 			System.out.println("3.Withdraw");
 			System.out.println("4.Exit");
 			System.out.println("Your Choice");
 			choice = scanner.nextInt();
 			switch (choice) {
 			case 1:
 				checkBalance();
 				break;
 			case 2:
 				deposit();
 				break;
 			case 3:
 				withdraw();
 				break;
 			case 4:
 				System.out.println("Thank you for coming");
 				break;
 			default:
 				System.out.println("Invalid option");
 			}
 		} while (choice != 4);
 	}

 	private void checkBalance() {
 		System.out.println("your current balance is:" + account.getBalance());
 	}

 	private void deposit() {
 		System.out.println("Enter the amount deposit:");
 		double amount = scanner.nextDouble();
 		if (amount <= 0) {
 			System.out.println(" Deposit must be positive.");
 		} else if (account.deposit(amount)) {
 			System.out.printf("successfully Deposited", amount, account.getBalance());
 		} else {
 			System.out.println("Failed Deposit again");
 		}
 	}

 	private void withdraw() {
 		System.out.println("Enter the amount you withdraw:");
 		double amount = scanner.nextDouble();
 		if (amount <= 0) {
 			System.out.println(" Withdrawal must be positive.");
 		} else if (account.deposit(amount)) {
 			System.out.printf("successfully Withdrew", amount, account.getBalance());
 		} else {
 			System.out.println("Withdrawal failed. Insufficient balance");
 		}

 	}

 	public static void main(String[] args) {
 		ATM_Machine userAccount = new ATM_Machine(1000.00);
 		ATM atm = new ATM(userAccount);
 		atm.start();
 	}
 }

    
  
		
 

	
	
