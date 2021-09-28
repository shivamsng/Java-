package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InserIntoTable {
	 static final String url="jdbc:mysql://localhost/studentRecord";
	 static final String user="root";
	 static final String pass="Root";
	 
 	public static void main(String[] args) {
 		try(Connection conn=DriverManager.getConnection(url,user,pass);
 				Statement stm=conn.createStatement();)
 		{
 			String sql="INSERT INTO studentDetail VALUES(101,'Shivam',20,'chandigarh')";
 			stm.executeUpdate(sql);
 			
 			sql="INSERT INTO studentDetail VALUES(102,'Pankaj',23,'delhi')";
 			stm.executeUpdate(sql);

 			sql="INSERT INTO studentDetail VALUES(103,'Yash',24,'gurugram')";
 			stm.executeUpdate(sql);

 			sql="INSERT INTO studentDetail VALUES(104,'Yatharth',25,'Noida')";
 			stm.executeUpdate(sql);
 			
 			System.out.println("Record Inserted......");
 		}
 		catch(SQLException e) {
 			e.printStackTrace();
 		}
	}
}