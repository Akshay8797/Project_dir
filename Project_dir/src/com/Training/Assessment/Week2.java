package com.Training.Assessment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double sal;

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface getSalary {
	}

	@getSalary
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee Id: " + id + " , Name: " + name + " , Salary: " + sal;
	}
}

@SuppressWarnings("serial")
class AnnotaionNotPersistedException extends Exception {
	AnnotaionNotPersistedException(String s) {
		super(s);
	}
}

public class Week2 {
	static void checkMethod(Method[] m) throws AnnotaionNotPersistedException {
		int flag = 0;
		for (Method i : m) {
			if (i.getName().equals("getSal"))
				flag = 1;
		}
		if (flag == 1)
			System.out.println("Method Found");
		else
			throw new AnnotaionNotPersistedException("Method Not Found");
	}

	public static void main(String[] args) throws Exception {
		Employee e = new Employee(101, "Akshay", 35000);
		System.out.println(e);
		try {
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(e);
			out.flush();
			fout.flush();
			out.close();
			fout.close();
			System.out.println("Object has been Serialized!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Employee e1 = null;
		try {
			FileInputStream file = new FileInputStream("f.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			e1 = (Employee) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been Deserialized!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		@SuppressWarnings("rawtypes")
		Class c = e1.getClass();
		System.out.println("The name of class is " + c.getName());

		System.out.println("List of Methods: ");
		Method[] m = c.getMethods();

		for (Method i : m)
			System.out.print(i.getName() + "(),  ");
		System.out.println();
		try {
			checkMethod(m);
		} catch (Exception ep) {
			ep.printStackTrace();
		}
	}
}