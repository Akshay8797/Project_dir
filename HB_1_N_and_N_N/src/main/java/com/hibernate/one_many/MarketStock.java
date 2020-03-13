package com.hibernate.one_many;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MarketStock {

	public static void main(String[] args) {
		Configuration cnfg = new Configuration();
		cnfg.configure("hibernate.cfg.xml");
		SessionFactory sFactory = cnfg.buildSessionFactory();
		Session session = sFactory.openSession();
		Market market1 = new Market("ABC");
		Market market2 = new Market("DEF");
		Stock stock1 = new Stock("Gold", market1);
		Stock stock2 = new Stock("Silver", market2);
		Stock stock3 = new Stock("Bronze", market2);
		Set<Stock> m1Stock = new HashSet<Stock>();
		m1Stock.add(stock1);
		m1Stock.add(stock2);
		Set<Stock> m2Stock = new HashSet<Stock>();
		m2Stock.add(stock2);
		m2Stock.add(stock3);
		market1.setStock(m1Stock);
		market2.setStock(m2Stock);

		Transaction tx = session.beginTransaction();
		session.persist(market1);
		session.persist(market2);
		tx.commit();
		session.close();
	}
}