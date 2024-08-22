package com.xyz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xyz.model.Employe;

public class HibernateEg1 {

	public static void main(String[] args) {
		//code for inserting 2 rows in to employe tables
		//steo-1:create session factory
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
		//step-2:open session
		Session session=factory.openSession();
		
		//step-3:begin transction
		//Transaction t=session.beginTransaction();
		Transaction t=session.beginTransaction();
		//step-4:based on number of roes creeate objects
		Employe e1=new Employe(1,"ramesh",40000);
		Employe e2=new Employe(2,"suresh",30000);
		
		
		//step-5:insert rows or objects
		session.save(e1);
		session.save(e2);
		//step=6:commit transction
		t.commit();
		//step-7:close session and close factory
		session.close();
		factory.close();
		
	}

}
