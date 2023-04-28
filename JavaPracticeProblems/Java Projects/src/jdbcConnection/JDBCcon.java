/*3. IN MYSQL „CREATE EMPLOYEES TABLE WITH THE COLUMNS EMPID, EMP_NAME, SALARY, DEPARTMENT_ID USING JDBC BUILD THE PROGRAM TO PERFORM BELOW ACTIONS
1. INSERT AT LEAST 20 RECORDS ( NOTE: SALARY RANGES BETWEEN 1000 TO 50000).
2. UPDATE SALARY INFORMATION TO INCREMENT 10% FOR WHOSE SALRY LESSTHAN 10000.
3. DELETE ALL THE RECORDS WHOSE SALARY LESS THAN 20000.

*/




package jdbcConnection;

import java.sql.*;


public class JDBCcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/sriharivishnu";
		String uname="root";
		String pass="Vichu@1998";
		
		//1. INSERT AT LEAST 20 RECORDS ( NOTE: SALARY RANGES BETWEEN 1000 TO 50000).
		
		//String Query="insert into employee values(01,'srihari',200000,'Manager'),(02,'vishnu',35000,'Developer'),(03,'sri',150000,'Assistant Manager'),(04,'hari',80000,'Senior Developer'),(05,'praveen',110000,'Analyst'),(06,'kumar',60000,' senior Developer'),(07,'nikhil',90000,'HR'),(08,'harish',35000,'junior Developer'),(09,'suraj',550000,'developer'),(10,'rahul',44500,'developer'),(11,'srihari',20000,'Manager'),(12,'vishnu',3500,'Developer'),(13,'sri',15000,'Assistant Manager'),(14,'hari',8000,'Senior Developer'),(15,'praveen',11000,'Analyst'),(16,'kumar',6000,' senior Developer'),(17,'nikhil',9000,'HR'),(18,'harish',3500,'junior Developer'),(19,'suraj',5500,'developer'),(20,'rahul',4450,'developer');";
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection(url,uname,pass);
//			Statement str=con.createStatement();
//			int i=str.executeUpdate(Query);
//			System.out.println(i+" Insert the data succefully!!!");
		
			
			//2. UPDATE SALARY INFORMATION TO INCREMENT 10% FOR WHOSE SALRY LESSTHAN 10000.
			
//			String Query="update employee set Employee_salary=((Employee_salary*0.1)+Employee_salary) where Employee_salary<10000" ;
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con=DriverManager.getConnection(url,uname,pass);
//			Statement str=con.createStatement();
//			int i=str.executeUpdate(Query);
//			System.out.println(i+" Added 10% sucesfully to the data !!!");
			
			
			
			
			
			//3. DELETE ALL THE RECORDS WHOSE SALARY LESS THAN 20000.
			
	String Query="delete from Employee where Employee_salary<20000" ;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			Statement str=con.createStatement();
			int i=str.executeUpdate(Query);
			System.out.println(i+" Deleted sucesfully !!!");
			
			str.close();
			con.close();
		
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
