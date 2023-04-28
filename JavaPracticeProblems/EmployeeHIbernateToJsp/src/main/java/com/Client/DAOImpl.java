package com.Client;



import org.hibernate.HibernateException;
import org.hibernate.Session;

public class DAOImpl implements EmpDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void readEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
	}

	@Override
	public Employee fetchEmployees() {
		// TODO Auto-generated method stub
		
		 Employee employee;
		   try (Session session = DAOImpl.getSessionFactory().openSession()) {

				 employee = session.get(Employee.class,eid );
				if(employee != null){
					return employee;
				}else{
					System.out.println("Employee........ID");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public void updateEmployee(int id, String ename, String enumber) {
		// TODO Auto-generated method stub
		   Session session = HibernateUtils.getSessionFactory().openSession();
	        Transaction transaction = session.beginTransaction();
	        Employee details = (Employee)session.load(Employee.class, id);
	        details.setEname(ename);
	        details.setEnumber(enumber);
	        session.update(details);
	        transaction.commit();
	        session.close();
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(employee);
        
	}

}
