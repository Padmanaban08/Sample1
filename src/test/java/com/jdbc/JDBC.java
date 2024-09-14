package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "Root");
			System.out.println("DB Connected");
			Statement statement = connection.createStatement(); //query execute 
			//String query = "select * from sys.Accenture;";
			String query = "select * from sys.ags;";
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
//			while(rs.next()) {
//				System.out.println(rs.getString(3));
//			}
				} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
