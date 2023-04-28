/*3. IN MYSQL „CREATE EMPLOYEES TABLE WITH THE COLUMNS EMPID, EMP_NAME, SALARY, DEPARTMENT_ID USING JDBC BUILD THE PROGRAM TO PERFORM BELOW ACTIONS
1. INSERT AT LEAST 20 RECORDS ( NOTE: SALARY RANGES BETWEEN 1000 TO 50000).
2. UPDATE SALARY INFORMATION TO INCREMENT 10% FOR WHOSE SALRY LESSTHAN 10000.
3. DELETE ALL THE RECORDS WHOSE SALARY LESS THAN 20000.

*/




package jdbcConnection;

import java.sql.*;


public class JDBCOracleSql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String uname="system";
		String pass="admin";
		
		//1. INSERT AT LEAST 20 RECORDS ( NOTE: SALARY RANGES BETWEEN 1000 TO 50000).
		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
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








