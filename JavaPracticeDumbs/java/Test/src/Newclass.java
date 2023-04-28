
class Audi{
	int speed;
	String color;
	
	public void audi() {
		System.out.println("Audi is Running");
	}
	
	
	Audi(int s, String c){
		speed = s;
		color = c;
	}
	Audi(){
		speed=100;
		color="Black";
	}
	}	

	
class Benz{
		
		int race;
		String model;
		
		public void  benz() {
			System.out.println("Benz is Running");
		}
		
	Benz(int a,String b){
		race=a;
		model=b;
	}
	

	
	Benz(){
		race=135;
		model="rosy";
	}
	}
	

public class Newclass {

	public static void main(String[] args) {
		
		Audi travel = new Audi(300,"white");
		
		//travel.speed=200;
		//travel.color="White";
		travel.audi();
		 System.out.println(travel.speed +" "+ travel.color);
		 
		 Benz travels=new Benz(256,"block");
		 
		 //travels.race=250;
		 //travels.model="Coop";
		 travels.benz();
		 
		 System.out.println(travels.race + " " + travels.model);    
		

	}

}
