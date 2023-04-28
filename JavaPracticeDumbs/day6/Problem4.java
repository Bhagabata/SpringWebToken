package day6;
class Employee{
	String name;
	int YearOfJoining;
	String address;
	
	Employee(String name, int YearOfJoining, String address){
		this.name=name;
		this.YearOfJoining=YearOfJoining;
		this.address=address;
	}
	void displyEmployee(){
System.out.println(name+"\t"+"\t"+YearOfJoining+"\t"+address);
	}
}

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Name \t Year Of Joining  Address");
		Employee obj =new Employee("Robert",1994,"64C-WallsStreat");
		Employee obj1 =new Employee("Sam",2000,"68D-WallsStreat");
		Employee obj2 =new Employee("John",1999,"26B-WallsStreat");
		obj.displyEmployee();
		obj1.displyEmployee();
		obj2.displyEmployee();

}}
