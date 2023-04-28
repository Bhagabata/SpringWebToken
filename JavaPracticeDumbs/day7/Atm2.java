package day7;

import java.util.Scanner;

class Balance{
	int amount=20000;
	void balance() {
		System.out.println("balance"+ amount);
	}
}
class PinNumber{
	boolean k=false;
	public boolean checkPin(int pw) {
		if(pw==1111||pw==2222||pw==3333) {
			k=true;
		}
			return k;
		
	}
}
class Debit{
	void debit(int amount, Balance b) {
		if(amount<b.amount) {
			b.amount=b.amount-amount;
			System.out.println("Amount withdrawn : "+ b.amount);
		}
		else {
			System.out.println("Debit amount exceed than amount balance!");
		}
	}
}
class Credit{
	void credit(int amount,Balance b) {
		b.amount=b.amount-amount;
		System.out.println(b.amount+" amount Credited Succesfully!!");
	}
}
public class Atm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Please insert your card ");
System.out.println("Your card is Inserted ");
System.out.println("Plese enter Your ATM Pin! ");
int pn =sc.nextInt();
System.out.println("Enter your Choice\n1.Withdraw\n2.Deposit\n3.Check Balance");
System.out.println("Choice");
int choice =sc.nextInt();
Balance b=new Balance();
PinNumber objPin =new PinNumber();
boolean k=objPin.checkPin(pn);
if(k) {
	switch(choice) {
	case 1:{
		System.out.println("Withdraw");
		System.out.println("Enter a Amount");
		int a1 =sc.nextInt();
		if(a1%100==0) {
			Debit objD=new Debit();
			objD.debit(a1,b);
		}
		else {
			System.out.println("invalid amount!!");
		}
	}
	case 2:{
		System.out.println("Deposit");
		System.out.println("Enter a Amount");
		int a2 =sc.nextInt();
		if(a2%100==0) {
			Credit objD=new Credit();
			objD.credit(a2,b);
		}
		else {
			System.out.println("invalid amount!!");
		}
	}
	case 3:{
		System.out.println("Check the Balance");
		Balance obj1=new Balance();
		obj1.balance();
	}
	}
}
else {
	System.out.println("invalid Input!!");
}

	}

}
