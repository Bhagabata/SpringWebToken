/*1,constructors

create class with variables using variable age.height,weight ,no,one or two parameterized 
constructor and provide output as below

No parameterized constructor
Age:0	Height0.0	Weight0.0
One Parameter Constructor
Age:10	Height0.0	Weight0.0
Two parameter Constructor
Age:10	Height5.0	Weight0.0
Three parameter Constructor
Age:10	Height5.0	Weight65.0

----------------------------------------*/

package day5;

public class Prblm1 {
	int age=0;
	double Height=0.0;
	double weight=0.0;
	static int age1=10;
	static double height1=5.0;
	static double weight1=65.0;
Prblm1(){
	System.out.println("No parameterized Constructor");
	System.out.print("Age:"+age +"     ");
	System.out.print("Height:"+Height + "     ");
	System.out.println("Weight:"+weight + "  ");
	
}

Prblm1(int age1){
	System.out.println("one parameterized Constructor");
	System.out.print("Age:"+age1 +"    ");
	System.out.print("Height:"+Height + "    ");
	System.out.println("Weight:"+weight + "    ");
}
Prblm1(int age1,double height1){
	System.out.println("two parameterized Constructor");
	System.out.print("Age:"+age1 +"    ");
	System.out.print("Height:"+height1 + "    ");
	System.out.println("Weight:"+weight + "    ");
}
Prblm1(int age1 ,double height1,double weight1 ){
	System.out.println("two parameterized Constructor");
	System.out.print("Age:"+age1 +"    ");
	System.out.print("Height:"+height1 + "    ");
	System.out.println("Weight:"+weight1 + "    ");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
Prblm1 ob=new Prblm1();
Prblm1 ob1=new Prblm1(age1);
Prblm1 ob2=new Prblm1(age1,height1);
Prblm1 ob3=new Prblm1(age1,height1,weight1);
}

}



