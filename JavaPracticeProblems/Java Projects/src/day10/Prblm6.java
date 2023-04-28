/*6.
A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank.Create a class 'Bank' with a method 'getBalance'
which returns 0. Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance'
which returns the amount deposited in that particular bank. Call the method 'getBalance' by the object of each of the three banks.*/






package day10;
class Bank{
	int getBalance() {
		return 0;
	}
}
class BankA extends Bank{
	long getBalance(long a) {
		System.out.println("Srihari is deposited the amount is : $"+a);
		return a;
	}
}
class BankB extends BankA{
	long getBalance(long b) {
		System.out.println("Vishnu is deposited the amount is : $"+b);
		return b;
	}
}
class BankC extends BankB{
	long getBalance(long c) {
		System.out.println("Praveen is deposited the amount is : $"+c);
		return c;
	}
}
public class Prblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA obj1=new BankA();
		obj1.getBalance(1000);
		BankB obj2=new BankB();
		obj2.getBalance(1500);
		BankC obj3=new BankC();
		obj3.getBalance(2000);

	}

}
