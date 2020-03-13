package com.hibernate.many_many;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentCourse {
	public static void insertCourses(SessionFactory sessionFactory) {
		Student student_tom = new Student("Tom");
		Student student_jasper = new Student("Jasper");
		Student student_ivan = new Student("Ivan");

		Set<Student> java_students = new HashSet<Student>();
		java_students.add(student_tom);
		java_students.add(student_ivan);
		Set<Student> hibernate_students = new HashSet<Student>();
		hibernate_students.add(student_tom);
		hibernate_students.add(student_jasper);
		Set<Student> spring_students = new HashSet<Student>();
		spring_students.add(student_jasper);
		spring_students.add(student_ivan);

		Course course_java = new Course("Java", java_students);
		Course course_hibernate = new Course("Hibernate", hibernate_students);
		Course course_spring = new Course("Spring", spring_students);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(course_java);
		session.persist(course_hibernate);
		session.persist(course_spring);
		tx.commit();
		session.close();
	}

	public static void deleteCourses(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = session.load(Course.class, 1L);
		session.delete(course);
		tx.commit();
		session.close();
	}

	public static void updateCourses(SessionFactory sessionFactory) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Course course = session.load(Course.class, 1L);
		course.setCourseName("C++");
		tx.commit();
		session.close();
	}

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		insertCourses(sessionFactory);
		updateCourses(sessionFactory);
		System.out.println("Done");
	}
}