package com.Client;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {
Employee obj=new Employee();
EmpDAO obj1=new DAOImpl();


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 if(request.getParameter("addEmp")!=null){
         String ename = request.getParameter("ename");
         String enumber = request.getParameter("enumber");
         obj.setEname(ename);
         obj.setEnumber(enumber);
      obj1.readEmployee(obj);
         RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
         rd.forward(request, response);
}

}
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     if(request.getParameter("FetchEmployee")!=null){
    	 Employee neww=new Employee();
    	    neww = obj1.fetchEmployees();
        request.setAttribute("emp", neww);
        RequestDispatcher rd = request.getRequestDispatcher("Acess.jsp");
        rd.forward(request, response);
    }


if(request.getParameter("updateEmployee")!=null){
    int id1 = Integer.parseInt(request.getParameter("id"));
    String ename = request.getParameter("ename");
    String enumberup = request.getParameter("enumberupdate");
    obj1.updateEmployee(id1, ename, enumberup);
    RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
    rd.forward(request, response);
    
}

if(request.getParameter("deleteEmployee")!=null){
    int id2 = Integer.parseInt(request.getParameter("id"));
    obj.setEid(id2);
    obj1.deleteEmployee(obj);
     RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
   rd.forward(request, response);
}
}

}