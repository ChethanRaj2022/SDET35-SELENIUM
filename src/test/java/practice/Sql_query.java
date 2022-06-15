package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class Sql_query {

	public static void main(String[] args) throws SQLException  {
		Connection conn=null;
		try{
		// Register to database
		Driver driverRef=new Driver();
		
		DriverManager.registerDriver(driverRef);
		
		// Get the connection
		 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
		// create the query
	    java.sql.Statement stat = conn.createStatement();
		String query = "select * from students_info";
		 
		// Execute the query
	    ResultSet resultSet = stat.executeQuery(query);
	    while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
	    }}catch (Exception e) {
				    	
				        }
	    finally {
			
		//close the connection
	    conn.close();
	     	}

	

}
}
