package jdbcConnection;

import java.sql.*;

public class CallableStateEX {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/sriharivishnu";
		String name="root";
		String pass="Vichu@1998";
		
		
	String query="call srihari('kumar',56000,'developer')";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,name,pass);
		CallableStatement cal=con.prepareCall(query);
		int sc=cal.executeUpdate();
		System.out.println(sc+"sucessss");
		
		cal.close();
		con.close();
	
		
		
	}

}
