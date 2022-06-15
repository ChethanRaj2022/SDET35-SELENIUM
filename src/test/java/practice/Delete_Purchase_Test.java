package practice;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.PropertyFile_Utility;
import Generic_Utilities.WebDriver_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Delete_Purchase_Test {
	public static void main(String[] args) throws Throwable {
		Excel_Utility exl = new Excel_Utility();
		PropertyFile_Utility pro = new PropertyFile_Utility();
		Java_Utility jav = new Java_Utility();
		WebDriver_Utility wd = new WebDriver_Utility();
	
		
      String browser = pro.getDataFromProperty("browser");
	  String url = pro.getDataFromProperty("url");
	  String username = pro.getDataFromProperty("username");
	  String password = pro.getDataFromProperty("password");
	  
	  String orgName = exl.getStringDataFromExcel("Sheet1", 1, 3)+jav.getRandomNum();
	  WebDriver driver=wd.getRemoteDriver("browser");
	  
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
				  
		driver.get( url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		//driver.close();
		
		wd.mouseOverOnElement(driver, driver.findElement(By.linkText("More")));
		
		driver.findElement(By.name("Purchase Order")).click();
		driver.findElement(By.xpath("//img[@alt='Create Purchase Order...']")).click();
		driver.findElement(By.name("subject")).sendKeys("RCB");
		/*driver.findElement(By.name("bill_street")).sendKeys("davangere");
		//
		driver.findElement(By.name("ship_street")).sendKeys("banglore");
		driver.findElement(By.xpath("//img[@alt='Select']")).click();
	
		//Child - Vendor and action
		wd.switchToWindowExcludeParent(driver, "Vendors&action");
		
		driver.findElement(By.id("search_txt")).sendKeys("Sheela");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.linkText("Sheela")).click();	
		
		//Parent = Purchase order and actions
		wd.switchToWindow(driver,"PurchaseOrder&action");
	
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000)");
		
		driver.findElement(By.id("searchIcon1")).click();
		
		//Child - Products and actions 
		wd.switchToWindowExcludeParent(driver, "Products&action");
	
		
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys("bike");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.id("popup_product_41")).click();
		
		//Parent - Purchase Order and Actions
		wd.switchToWindow(driver, "PurchaseOrder&action");
						
			
		driver.findElement(By.id("qty1")).sendKeys("1");
		driver.findElement(By.name("bill_street")).sendKeys("davangere");
		driver.findElement(By.name("ship_street")).sendKeys("banglore");
		driver.findElement(By.name("button")).click();
			

		driver.findElement(By.name("Delete")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
			
			driver.quit();*/
			
			
			
			
		
		}
	}

