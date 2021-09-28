package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {
	static final String url="jdbc:mysql://localhost/StudentRecord";
	static final String user="root";
	static final String pass="Root";
	
    public static void main(String[] args) {
		try(Connection conn=DriverManager.getConnection(url,user,pass);
			Statement stm=conn.createStatement();)
		{
			String sql="create table studentDetail"+
		               "(id Integer not null,"+
					   "name varchar(20),"+
		               "age Integer,"+
					   "address varchar(20)"+
		               "Primary key (id))";
			
			stm.executeUpdate(sql);
			System.out.println("table created successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}