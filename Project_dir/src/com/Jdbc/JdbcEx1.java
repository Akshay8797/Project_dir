package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcEx1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Akshay8797");
		System.out.println("Connection Established!");
		PreparedStatement st=dbcon1.prepareStatement("Insert into mytable values(?,?)");
		st.setString(1, "JKL");
		st.setInt(2, 86375241);
		int i=st.executeUpdate();
		st.setString(1, "MNO");
		st.setInt(2, 86745132);
		i=st.executeUpdate();
		System.out.println("Records Inserted");
		PreparedStatement st11=dbcon1.prepareStatement("DELETE FROM mytable WHERE Name=(?)");
		st11.setString(1, "MNO");
		i=st11.executeUpdate();
		System.out.println("Record deleted");
		PreparedStatement st21=dbcon1.prepareStatement("UPDATE mytable set Name=(?) WHERE Phone=(?)");
		st21.setString(1, "JKL_New");
		st21.setInt(2, 86375241);
		i=st21.executeUpdate();
		dbcon1.close();
	}
}
