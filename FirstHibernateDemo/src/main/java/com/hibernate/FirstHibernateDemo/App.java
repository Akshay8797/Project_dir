package com.hibernate.FirstHibernateDemo;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void update(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Product product = session.load(Product.class, 1L);
		product.setName("Tables");
		tx.commit();
		session.close();
	}

	public static void delete(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Product product = session.load(Product.class, 1L);
		session.delete(product);
		tx.commit();
		session.close();
	}

	public static void insert(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		tx.begin();
		Product product = new Product("Chairs", 5000);
		long productId = (Long) session.save(product);
		tx.commit();
		System.out.println("Created product id:" + productId);
	}

	public static List<Product> getAllProducts(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		List<Product> productList = query.list();
		session.close();
		return productList;
	}

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		insert(sessionFactory);
		System.out.println(getAllProducts(sessionFactory));
	}
}