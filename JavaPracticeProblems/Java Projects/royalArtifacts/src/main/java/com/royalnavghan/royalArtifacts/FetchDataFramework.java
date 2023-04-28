package com.royalnavghan.royalArtifacts;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDataFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentDetails obj=new StudentDetails();

Configuration con=new Configuration()
.configure()
.addAnnotatedClass(StudentDetails.class);

SessionFactory sr=con.buildSessionFactory();

Session session=sr.openSession();
Transaction tx=session.beginTransaction();
obj=session.get(StudentDetails.class, 103);
tx.commit();
System.out.println(obj);

	}

}
