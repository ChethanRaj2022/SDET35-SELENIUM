package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Example_nonsql {

	public static void main(String[] args) throws Throwable  {
		
		Connection conn =null;
		int result =0;
		try {
			
			Driver driverRef = new Driver(); 
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
			Statement stat = conn.createStatement();
			String query= "insert into tablename columnname() values()";
			result= stat.executeUpdate(query);
		}catch(Exception e) {
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


