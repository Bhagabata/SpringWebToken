package TESTINTERFACES;

interface Marker {
	
};


public class MarkerInterfaceex  implements Marker{
	
	void display() {
		
		System.out.println("hey i m impl marker interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarkerInterfaceex obj=new MarkerInterfaceex();
		if(obj instanceof Marker)
			obj.display();
			
			}
	}

}
