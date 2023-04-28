package prime;

public class Access {
  private static String name;
  
 public static String getName() {
	return name;
}

public static void setName(String srihari) {
	Access.name = srihari;
}

public static void walking(){
	  System.out.println("srihari is walking");
  }
  
  public static void Running() {
	  System.out.println("Srihari is Running");
  }
  
  
  public static void main(String[]args) {
	  name="srihari";
	  walking();
	  Running();
	  
	  System.out.println(name);
  }
  
}
