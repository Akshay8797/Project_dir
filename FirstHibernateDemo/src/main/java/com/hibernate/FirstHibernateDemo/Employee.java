package com.hibernate.FirstHibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_MASTER")
public class Employee {
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue
	@Id
	@Column(name = "emp_id")
	private Long eid;

	@Column(name = "name")
	private String ename;

	@Column(name = "salary")
	private double esal;

	public Employee() {
	}

	public Employee(String ename, double esal) {
		this.ename = ename;
		this.esal = esal;
	}

	public Employee(Long eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public Long geteId() {
		return eid;
	}

	public void seteId(Long eid) {
		this.eid = eid;
	}

	public String geteName() {
		return ename;
	}

	public void seteName(String ename) {
		this.ename = ename;
	}

	public double geteSal() {
		return esal;
	}

	public void seteSal(double esal) {
		this.esal = esal;
	}

	public String toString() {
		return eid + " - " + ename + " - " + esal;
	}
}