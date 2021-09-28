package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {
	static  final String url="jdbc:mysql://localhost/studentRecord";
	static final String user="root";
	static final String pass="Root";
	static final String insert_query="INSERT INTO studentDetail VALUES(?,?,?,?)";
	static final String query="select*from studentDetail";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		try(Connection conn=DriverManager.getConnection(url,user,pass);
			PreparedStatement pstm=conn.prepareStatement(insert_query);)
		{
			//taking input from keyboard----------------------
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			do {
				System.out.println("Enter student id ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter student name ");
				String name=br.readLine();
				System.out.println("Enter student age ");
				int age=Integer.parseInt(br.readLine());
				System.out.println("Enter student address ");
				String address=br.readLine();
				
				pstm.setInt(1, id);
				pstm.setString(2, name);
				pstm.setInt(3, age);
				pstm.setString(4, address);
				
				int i=pstm.executeUpdate();
				System.out.println(i +"Record affected");
				
				System.out.println("Do you want to continue y/n");
				String s=br.readLine();
				if(s.startsWith("n")) {
					break;
				}
				
			}while(true);
			
			//display
			ResultSet rs=pstm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("Id "+rs.getInt("id"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Age: "+rs.getInt("age"));
				System.out.println("Addresss: "+rs.getString("address"));
			}
			
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}