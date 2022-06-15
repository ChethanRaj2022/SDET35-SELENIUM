package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_pro {

	public static void main(String[] args) throws Throwable {
		// get the JAVA representation of the object foe the physical file
				FileInputStream fis = new FileInputStream("./src/test/resources/common.properties");
				
				// create the object for properties class
				Properties pro = new Properties();
				pro.load(fis);
				
				// read the values from the getProperty
				  String browser = pro.getProperty("browser");
				  String url2 = pro.getProperty("url2");
				  String username = pro.getProperty("username");
				  String password = pro.getProperty("password");
				  
				  //launch the browser
				  WebDriver driver;
				  if(browser.equalsIgnoreCase("Chrome"))
				 {
					  WebDriverManager.chromedriver().setup();
					  driver=new ChromeDriver();
				  }
				  else if(browser.equals("Firefox"))
				  {
					  
					  WebDriverManager.firefoxdriver().setup();
					  driver=new FirefoxDriver();
				  }
				  else
				  {
					  driver=new ChromeDriver();
				  }
				  driver.get(url2);
				  driver.findElement(By.id("email")).sendKeys(username);
				  driver.findElement(By.id("pass")).sendKeys(password);
				  driver.findElement(By.name("login")).click();
				  Thread.sleep(5000);
				  
				  driver.close();
				  
				  		  
				  

	}

}
