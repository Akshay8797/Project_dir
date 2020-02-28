package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcEx {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Akshay8797");
		System.out.println("Connection Established!");
		Statement s1 = dbcon.createStatement();
		ResultSet rs = s1.executeQuery("SELECT * FROM mytable");
		while (rs.next()) {
			String s = rs.getString("Name");
			int ph = rs.getInt("Phone");
			System.out.println(""+s+" "+ph);
		}
		rs.close();
		s1.close();
		dbcon.close();
	}
}
