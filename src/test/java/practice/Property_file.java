package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/commonproperty.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty("key");
		
		
		
		

	}

}
