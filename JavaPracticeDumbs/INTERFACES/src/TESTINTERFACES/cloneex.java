package TESTINTERFACES;
import java.util.Scanner;
public class cloneex implements Cloneable  {
	int age;
	   String name;
	   public cloneex (String name, int age){
	      this.age = age;
	      this.name = name;
	   }
	   public void display() {
	      System.out.println("Name of the student is: "+name);
	      System.out.println("Age of the student is: "+age);
	   }
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your name: ");
	      String name = sc.next();
	      System.out.println("Enter your age: ");
	      int age = sc.nextInt();
	      cloneex obj = new cloneex(name, age);
	      cloneex obj2 = (cloneex) obj.clone();
	      obj2.display();
	}

}
