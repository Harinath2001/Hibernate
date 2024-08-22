package com.xyz;


		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.cfg.Configuration;

		import com.xyz.model.Employe;


		public class HobernateEx4 {

			public static void main(String[] args) {
				//code for inserting 2 rows in to employe tables
						//step-1:create session factory
						SessionFactory factory=new Configuration().configure().buildSessionFactory();
					
						//step-2:open session
						Session session=factory.openSession();
						Transaction t=session.beginTransaction();
						//update operation e->1,ramesh,40000-->we will change eno 1 salary to 80000
						//a.get eno 1
						Employe e1=session.get(Employe.class,1);
						//b.change salary to 80000
						//e1.setsal(80000);
						//session.update(e1);
						Employe e2=session.get(Employe.class,2);
					     session.delete(e2);
						
						t.commit();
						
												
						//step=6:commit transction
						
						//step-7:close session and close factory
						session.close();
						factory.close();
						

			}

		}

	


