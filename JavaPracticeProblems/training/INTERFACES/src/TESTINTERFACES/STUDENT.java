package TESTINTERFACES;

public class STUDENT implements Cloneable {
	
	int id;  
	String name;  
	STUDENT(int id, String name){  
	this.id = id;  
	this.name = name;  
	}  
	@Override  
	protected Object clone() throws CloneNotSupportedException {  
	// TODO Auto-generated method stub  
	return super.clone();  
	}  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENT s = new STUDENT(101, "John");  
		System.out.println(s.id + " " + s.name);  
		try {  
			STUDENT s1 = (STUDENT)s.clone();  
		System.out.println(s1.id + " " + s1.name);  
		}catch (Exception e) {  
		// TODO: handle exception  
		System.out.println(s.toString());  
		}  
	
	}

}
