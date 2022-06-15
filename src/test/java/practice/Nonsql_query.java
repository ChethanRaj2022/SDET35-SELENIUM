package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Nonsql_query {

	public static void main(String[] args) throws SQLException {
		Connection conn =null;
		int result =0;
		try {
			
			Driver driverRef = new Driver();
			DriverManager.registerDriver(driverRef);
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			Statement stat = conn.createStatement();
			String query= "insert into Subjects values(13,'biology')";
			
			result= stat.executeUpdate(query);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			
		}finally {
			
			if(result==1) {
				System.out.println("row inserted successfully");
			}else {
				System.out.println("row is not inserted--!");
			}
			conn.close();
			
			}
		}
		
		


	}

