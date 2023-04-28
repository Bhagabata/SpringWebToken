package day6;

import java.util.*;


class Account{
	private String name;
	private long accountNo = Math.round((Math.random()*1000000000));
	private long passcode = Math.round((Math.random()*10000));
	private long balance = 0;
	
	void createAccount(String name) {
		this.name = name;
		System.out.println("Hello " + this.name + " Welcome to HDFC, Use the following credentials to access your account \n"
				+ "account Number: "+ accountNo +" \nPasscode: " + passcode);
	}
	
	void debitAccess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Account no: ");
		long accountNo = sc.nextLong();
		System.out.print("Please enter your passcode: ");
		long passcode = sc.nextLong();
		
		if(this.accountNo == accountNo && this.passcode == passcode) {
			System.out.print("Please enter the amount you want to withdraw: ");
			long debitAmount = sc.nextLong(); 
			Account ob = new Account();
			ob.debit(debitAmount);
		}
		else {
			System.out.println("Please enter correct credentials.");
		}
		
		sc.close();
	}
	
	void creditAccess() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Account no: ");
		long accountNo = sc.nextLong();
		System.out.print("Please enter your passcode: ");
		long passcode = sc.nextLong();
		
		if(this.accountNo == accountNo && this.passcode == passcode) {
			System.out.print("Please enter the amount you want to deposit: ");
			long creditAmount = sc.nextLong(); 
			this.balance += creditAmount;
			System.out.println("You have added "+ creditAmount + " in your account \nYou have "+this.balance+" in your account.");
		}
		else {
			System.out.println("Please enter correct credentials.");
		}
		
		sc.close();
	}
	
	void debit(long balance) {
		
		
		if(balance <= this.balance) {
			this.balance = this.balance - balance;
			System.out.println("You have withdrawn " + balance + " \nYou have " +this.balance +" left in your account.");
		}
		else {
			System.out.println("Insufficent balance, Please check your balance and enter correct amount.");
		}
	}
	
	void checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Account no: ");
		long accountNo = sc.nextLong();
		sc.nextLine();
		System.out.print("Please enter your passcode: ");
		long passcode = sc.nextLong();
		sc.nextLine();
		
		if(accountNo == this.accountNo && passcode == this.passcode) {
			System.out.println("You have "+ this.balance + " left in your account.");
		}
		
		sc.close();
	}
}

class Welcome{

	
	void welcomeUser(int action, String name) {
		
		Account hdfc = new Account();
		hdfc.createAccount(name);
		
		
		if(action == 1) {
			hdfc.debitAccess();
		}
		else if(action == 2) {
			hdfc.creditAccess();
		}
		else if(action == 3) {
			hdfc.checkBalance();
		}
		else if(action == 4) {
			System.out.println("Thank you for visiting HDFC");
			System.exit(0);
		}
		else {
			System.exit(0);
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();	
		
		Welcome ob = new Welcome();
		int action = 0;
		
		while (action != 4) {
			System.out.println("Hello " + name +"\n"
					+"Please select an option: \n"
					+ "debit amount = 1\ncredit amount = 2\ncheck blanace = 3\nclose account = 4");
					action = sc.nextInt();
					sc.nextLine();					
					ob.welcomeUser(action, name);
		}
		
		sc.close();
	}

}

