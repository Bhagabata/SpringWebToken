class data{
	private int id;
	private String password;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
public class Getset {
  public static void main(String[]args) {
	  System.out.println("Hi guys");
	  data obj = new data();
	  obj.setId(123456);
	  obj.getId();
  }	  
}

