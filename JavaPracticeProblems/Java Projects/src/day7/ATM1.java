package day7;

import java.util.Scanner;

class Balance{
	double amount=20000;
	void balance() {
		
		System.out.println(amount+" Balance Amount");
	}
}
class PinPassword{
	boolean k=false;
	public boolean checkPin(int PW) {
		if(PW==1111||PW==2222||PW==3333) {
			 k=true;
		}
	return k;
	}
}
class Credit{
	void credit(double amount, Balance b) {
			b.amount=b.amount+amount;
			System.out.println(amount+" credited Succesfully");
			System.out.println(b.amount+" Balance in your account");

	}
}
class Debit{
	void debit(double amount, Balance b) {
		if(amount<b.amount) {
			b.amount=b.amount-amount;
			System.out.println(amount+" debited Succesfully");
			System.out.println(b.amount+" Balance in your account");
		}
		else {
			System.out.println("Exceed Limit than Your Accounting");
		}
	}
}

public class ATM1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Pin ");
	int Pn =sc.nextInt();
	Balance b=new Balance();
	System.out.println("Enter Choice");
	System.out.println("1.withdraw\n2.Deposit\n3.Check Balance");
	int choice =sc.nextInt();
	PinPassword objPW=new PinPassword();
	boolean k=objPW.checkPin(Pn);
	if(k) {
		switch (choice) {
		case 1:{
			System.out.println("Withdrawn");
			System.out.println("Enter a Amount ");
			int debA=sc.nextInt();
			if(debA%100==0) {
				Debit Debobj=new Debit();
				Debobj.debit(debA, b);
			}
			else {
				System.out.println("invalid Amount!!");
			}
		}
		break;
		case 2:{
			System.out.println("Deposit");
			System.out.println("Enter a Amount ");
			int creObj=sc.nextInt();
			if(creObj%100==0) {
				Credit Debobjj=new Credit();
				Debobjj.credit(creObj, b);
			}
			else {
				System.out.println("invalid Amount!!");
			}
		}
		break;
		case 3:{
			System.out.println("Check Balance");
			Balance obj11 =new Balance();
			obj11.balance();
		}
		break;
		}
	}
	else {
	System.out.println("invalid Input");
}
}}
