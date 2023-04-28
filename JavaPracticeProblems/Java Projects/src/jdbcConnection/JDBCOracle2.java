package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCOracle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="system";
		String pass="admin";
		
		//1. INSERT AT LEAST 20 RECORDS ( NOTE: SALARY RANGES BETWEEN 1000 TO 50000).
		
		
		
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement str=con.createStatement();
			System.out.println("Connection succefully!!!");
			str.close();
			con.close();
		
	
			
		} catch (Exception e) {
			
			System.out.println(e+"Connection could not be established");
		}
		
	}

}
