package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

 public class PropertyFile_Utility {
	
	 /*
		 * This Method is used to get the Value from property file with the help of key
		 * @param key
		 * @return String 
		 */
		
		
		public String getDataFromProperty(String key) throws Throwable {
			
			FileInputStream fin = new FileInputStream("./src/test/resources/common.properties");
			Properties pro = new Properties();
			pro.load(fin);
			String data = pro.getProperty(key);

			return data;
		}
	}
 
  


