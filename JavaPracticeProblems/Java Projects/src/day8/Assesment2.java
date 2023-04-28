package day8;
class Emp{
	String FirstName;
	String LastName;
	double MonthlySalary;
	
Emp(String FirstName,String LastName,double MonthlySalary){
	this.FirstName=FirstName;
	this.LastName=LastName;
	this.MonthlySalary=MonthlySalary;
	
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public double getMonthlySalary() {
	return MonthlySalary;
}

public void setMonthlySalary(double monthlySalary) {
	if(MonthlySalary<0) {
		MonthlySalary=0;
	}
	else {
	MonthlySalary = monthlySalary;
}
}	
void EmployeeTest() {
	System.out.println(FirstName+" "+LastName+" "+MonthlySalary);
}
public double getyearlySalary() {
	double YearlySalary=MonthlySalary*12;
	return YearlySalary;
	
}
public double raisedSalary() {
	double raise=MonthlySalary*0.1;
	double raisedSalary=(MonthlySalary+raise)*12;
	return raisedSalary;
}
}

public class Assesment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Emp obj1=new Emp("SHV","Royal",23000);
   Emp obj2=new Emp("SRI","HARI",-12000);
   System.out.println(obj1.getFirstName()+obj1.getLastName()+obj1.getMonthlySalary()+obj1.getyearlySalary()+obj1.raisedSalary());
   System.out.println(obj2.getFirstName()+obj2.getLastName()+obj2.getMonthlySalary()+obj2.getyearlySalary()+obj2.raisedSalary());
   
	}

}
