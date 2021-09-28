package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {
	static final String url="jdbc:mysql://localhost/studentRecord";
	static final String user="root";
	static final String pass="Root";
	static final String query="select*from studentDetail";
	
	public static void main(String[] args) {
		
		try(Connection conn=DriverManager.getConnection(url,user,pass);
				Statement stm=conn.createStatement();)
		{
			String sql="UPDATE studentDetail " +
		            "SET age = 30 WHERE id =(101)";
			stm.executeUpdate(sql);
			ResultSet rs=stm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Id: "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Age: "+rs.getInt("age"));
				System.out.println("Addresss: "+rs.getString("address"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}