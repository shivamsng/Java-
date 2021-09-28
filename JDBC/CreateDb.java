package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDb {
	static final String url="jdbc:mysql://localhost/";
	static final String user="root";
	static final String pass="Root";
	
	public static void main(String[] args) {
		
	try(Connection conn=DriverManager.getConnection(url,user,pass);
			Statement stm=conn.createStatement();)
	{
		String sql="create database StudentRecord";
		stm.executeUpdate(sql);
		System.out.println("database connected....");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}