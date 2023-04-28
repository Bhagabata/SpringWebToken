package day7;

import java.util.Scanner;

class Account{
	double balance;

Account(double initialValue){
	
	if(initialValue>0.0) 
	balance=initialValue;
	
}
void credit (double credit){
	balance = balance + credit;
}
void debits(double debitValue) {
	if(debitValue>balance) {
		debitValue=0.0;
		System.out.println("The debit amount exceeding the account balance !!");
	}
	balance = balance-debitValue;
}
public double getBalance() {
	System.out.println(balance + " Is your Balance");
	return balance;
}
}


public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter How much money You wants to debit :  ");
double abc =sc.nextDouble();
Account obj =new Account(20000);
obj.debits(abc);
obj.getBalance();




}


}
