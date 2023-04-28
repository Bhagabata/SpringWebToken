package com.Client;

public interface EmpDAO {
    public void readEmployee (Employee employee);
    public Employee fetchEmployees();
    public void updateEmployee (int id, String ename, String enumber);
    public void deleteEmployee (Employee employee);
}
