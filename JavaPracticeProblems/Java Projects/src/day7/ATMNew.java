package day7;
import java.util.Scanner;
class ATMACCOUNT{
	private long AccountNumber=Math.round((Math.random()*1000000000));
	private long passcode=Math.round((Math.random()*10000));
	private long Balance=22000;
	
boolean welcome() {
	System.out.println("Hi this is Your Account Number : "+AccountNumber);
	System.out.println("Hi this is Your Passcode : "+passcode);
	Scanner sc=new Scanner(System.in);
	System.out.println("Your Account number : ");
	long Acnum=sc.nextLong();
	System.out.println("Your passcode : ");
	long Acpas=sc.nextLong();
	if(Acnum==AccountNumber && Acpas==passcode) {
		System.out.println("Welcome to Royalnavghan Internet Banking!!");
		return true;
	}
	else {
		System.out.println("Please Enter Your Credential Correctly!! ");
		return false;
	}}
	void debit(long debitBalance){
		
		if(debitBalance<=Balance) {
			Balance-=debitBalance;
			System.out.println("Hello Your Withdrawn Amount "+debitBalance);
			System.out.println("You having Rs "+Balance+" In your Account.");
		}
		else {
			System.out.println("Sorry You've Tried Exceed amount Than Account!!  ");
		}
		
		 {
		
		}
	}
	void credit(long creditBalance) {
		
			Balance=Balance+creditBalance;
			System.out.println("Sucess!! Rs "+creditBalance+" Credited in your Account!!");
			System.out.println("Currently Rs "+Balance+ "In your Account!!");
		}
	void checkBalance() {

        
		long captcha=Math.round((Math.random())*1000000);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Captcha Below "+captcha);
		long capt=sc.nextLong();
		if(captcha==capt) {
			this.Balance=Balance;
			System.out.println("Rs "+Balance+"In your Account!");
		}
		else {
			System.out.println("Sorry!! Your Captcha is Incorrect!!");
		}
}

}
public class ATMNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter your name : ");
String uname=sc.nextLine();
System.out.println("hello "+uname+" Welcome to Royalnavghan Bank!!");
System.out.println("Please Following credtential to Use your Account ");
System.out.println("Please Note: This credential Only for One Time Transaction ");

ATMACCOUNT obj1=new ATMACCOUNT();
obj1.welcome();

while (true) {
	System.out.println("Press ENTER to check the menu: ");
	sc.nextLine();
	System.out.println("Please select an option: ");
	System.out.println("debit amount- 1");
	System.out.println("credit amount - 2 ");
	System.out.println("check balance - 3");
	System.out.println("close account - 4");
	
	int action=sc.nextInt();
	
	if(action==1) {
		System.out.println("Enter Amount To Withdraw :");
		obj1.debit(sc.nextLong());
		sc.nextLine();
	}
	else if(action==2) {
		System.out.println("Enter Amount to Credit :");
		obj1.credit(sc.nextLong());
		sc.nextLine();
	}
	else if(action==3) {
		obj1.checkBalance();
		sc.nextLine();
		
	}
	else if(action==4) {
		System.out.println("Thank You for visiting Royalnavghan  Internet Banking!!");
		return;
	}
	

	}
	
}}
