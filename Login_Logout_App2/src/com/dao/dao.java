package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dao{

	Connection con; // holds connection in between java & database
	PreparedStatement ps; // executes SQL queries

	public dao() throws SQLException, ClassNotFoundException {
		String path = "jdbc:oracle:thin:@localhost:1522:XE";
		String username = "user1";
		String password = "password";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(path, username, password);
		System.out.println(" Connection Establish Successfully !!!! " + con);
	}
	
	public boolean validate_user(String name,String pass) throws SQLException
	{
		String query="select * from U where name=?";
		ps=con.prepareStatement(query);
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			String password=rs.getNString("PASS");
			if(password.equals(pass))
				return true;
		}
		return false;
	}
	
	public boolean check_new_user(String name) throws SQLException
	{
		String query="select * from U where name=?";
		ps=con.prepareStatement(query);
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			String Name=rs.getNString("NAME");
			if(Name.equals(name))
				return false;
		}
		return true;
	}
	
	public void add_user(String name,String pass) throws SQLException
	{
		String q="insert into U values (?,?)";
		ps=con.prepareStatement(q);
		ps.setString(1,name);
		ps.setNString(2, pass);
		ResultSet rs=ps.executeQuery();
	}
	
	
	
	
}