package oops;

class Animals{  
void eats(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void barks(){System.out.println("barking...");}  
}  
class BabyDog extends Dogs{  
void weeps(){System.out.println("weeping...");}  
}  

public class TestMultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.weeps();  
		d.barks();  
		d.eats();  
		}
	}


