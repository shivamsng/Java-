package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class callablestatement {
	static final String url="jdbc:mysql://localhost/studentRecord";
	static final String user="root";
	static final String pass="Root";
	static final String query="{(call empName(?,?)}";
	
	public static void main(String[] args)throws SQLException  {
		try(Connection conn=DriverManager.getConnection(url,user,pass);
			CallableStatement cstm=conn.prepareCall(query);)
		{

		 
		 cstm.setInt(1,106);
		 cstm.setString(2,"Shivam");
		 
		
		 System.out.println("Executing Stored Procedure");
		 cstm.executeUpdate();
		 
		 //Retrieve Employee name
		 int res=cstm.getInt(1);
		 String res1=cstm.getString(2);
		 System.out.println(res+""+res1);
		  
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}