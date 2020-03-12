package com.hibernate.FirstHibernateDemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void upd(SessionFactory sionFactory) {
		Session sion = sionFactory.openSession();
		Transaction t = sion.beginTransaction();
		t.begin();
		Employee emp = sion.load(Employee.class, 2L);
		emp.seteName("DEF");
		t.commit();
		sion.close();
	}

	public static void delete(SessionFactory sionFactory) {
		Session sion = sionFactory.openSession();
		Transaction t = sion.beginTransaction();
		t.begin();
		Employee emp = sion.load(Employee.class, 1L);
		sion.delete(emp);
		t.commit();
		sion.close();
	}

	public static void insert(SessionFactory sionFactory) {
		Session sion = sionFactory.openSession();
		Transaction t = sion.beginTransaction();
		t.begin();
		Employee emp = new Employee("ABC", 50000);
		long empId = (Long) sion.save(emp);
		t.commit();
		System.out.println("Created Employee id:" + empId);
	}

	public static void getAllEmployeesUsingSQL(SessionFactory sionFactory) {
		Session sion = sionFactory.openSession();
		SQLQuery query = sion.createSQLQuery("INSERT INTO EMP_MASTER(EMP_ID,NAME,SALARY) VALUES(2,'GHI',20000)");
		int upd = query.executeUpdate();
		if (upd == 0 || upd == 1) {
			System.out.println(upd + " row affected");
		} else
			System.out.println(upd + " rows affected");
		System.out.println("Inserted Records Successfully");
		System.out.println("Successfully updd");
		SQLQuery query2 = sion.createSQLQuery("SELECT * FROM EMP_MASTER");
		@SuppressWarnings("unchecked")
		List<Object[]> empList = query2.list();
		for (Object[] obj : empList) {
			System.out.println(obj[0] + " " + obj[1] + " " + obj[2]);
		}
		sion.close();
	}

	public static List<Employee> getAllEmployees(SessionFactory sionFactory) {
		Session sion = sionFactory.openSession();
		Query query3 = sion.createQuery("from Employee");
		@SuppressWarnings("unchecked")
		List<Employee> empList = query3.list();
		sion.close();
		return empList;
	}

	public static void main(String[] args) throws Exception {
		Configuration cnfg = new Configuration();
		cnfg.configure("hibernate.cfg.xml");
		SessionFactory sionFactory = cnfg.buildSessionFactory();
		insert(sionFactory);
		System.out.println(getAllEmployees(sionFactory));
		getAllEmployeesUsingSQL(sionFactory);
		sionFactory.close();
	}
}