/*4.
4.
Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default 
values name as "unknown", age as '0' and address as "not available". It has two members with the same name 'setInfo'. 
First method has two parameters for name and age and assigns the same whereas the second method takes has three 
parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects
*/



package day10;
class Student{
	int age=0;
	String name="unknown";
	String address="not_available";
	
	Student( String name,int age ,String address){
		this.age=age;
		this.name=name;
		this.address=address;
	}
	void setInfo(String name,int age) {
			
		System.out.println("Name : "+name+" Age : "+age);
	}
	void setInfo(String name,int age,String address) {
		
		System.out.println("Name : "+name+" Age : "+age+" Address : "+address);
	}
}
public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student array[]=new Student[10];
array[0]=new Student("srihari",26,"Tamilnadu");

for(int i=0;i<10;i++) {
	array[0].setInfo("Srihari",26);
	array[0].setInfo("vishnu", 27, "Tamilnadu");
}
	}

}
