<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="add">
        <h1> Add Employee </h1>
        <form action="add" method="GET">
            <table>
                <tr>
                    <td> Employee Name: </td>
                    <td><input type="text" name="ename"></td>
                </tr>
                <tr>
                    <td> Employee Number: </td>
                    <td><input type="text" name="enumber"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="addEmp" value="Add"></td>
                    
                </tr>
            </table>
        </form>
        </div>
        <form action="add" method="GET">
            <input type="submit" name="FetchEmployee" value="Show"> <br><br>
            
            
        </form>
</body>
</html>