package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Unit_Testing_Jdbc {

	public static void main(String[] args) throws SQLException {
		String ProjectName="Apple";
		Connection conn =null;
		try {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
		System.out.println("connection is done");
		Statement stat = conn.createStatement();
		String query="select* from project";
		
	ResultSet resultset = stat.executeQuery(query);
		boolean flag=false;
		while(resultset.next()) { 
			
		 String actProjectName = resultset.getString(4);
		if(actProjectName.equals(actProjectName)) {
			flag=true;
			System.out.println("is matching");
			System.out.println(actProjectName);
		}
		}
	if(flag==false)
	{
		
		System.out.println("is not matching");
	}
	}
	catch(Exception e)
	{
	}
	finally {
		conn.close();
	}
	}
}

	
	
		

