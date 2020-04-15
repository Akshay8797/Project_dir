package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductTest {

	public static void main(String[] args) throws Exception {
		Configuration configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configure.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product("milk", 2000);
		session.persist(p);
		tx.commit();
		System.out.println("session closed");
		session.close();
		// Thread.sleep(21000);
		Session session1 = sessionFactory.openSession();
		sessionFactory.getCache().evictEntity(Product.class, p.getId());// remove any object from cache
//so that select query will be called          

		Product p1 = session1.load(Product.class, p.getId());
//session.evict(p.getId());//remoeve any object from session
		System.out.println(p1);
		session1.close();
	}
}