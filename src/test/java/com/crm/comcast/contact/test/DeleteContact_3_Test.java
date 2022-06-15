package com.crm.comcast.contact.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.comcast.POMRepo.ContactsInfoPage;
import com.crm.comcast.POMRepo.ContactsPage;
import com.crm.comcast.POMRepo.CreatedCntPage;
import com.crm.comcast.POMRepo.HomePage;
import com.crm.comcast.POMRepo.LoginPage;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.PropertyFile_Utility;
import Generic_Utilities.WebDriver_Utility;



public class DeleteContact_3_Test {
	public static void main(String[] args) throws Throwable {
		
		Excel_Utility exl = new Excel_Utility();
		PropertyFile_Utility pro = new PropertyFile_Utility();
		Java_Utility jav = new Java_Utility();
		WebDriver_Utility wd = new WebDriver_Utility();
		
		String LastName =exl.getStringDataFromExcel("Sheet1", 4, 7)+jav.getRandomNum();
		String alertMsg =exl.getStringDataFromExcel("Sheet1", 4, 14)+jav.getRandomNum();
		String browser = pro.getDataFromProperty("browser");
		
		WebDriver driver=wd.getRemoteDriver(browser);
		wd.maximizeAndApplyImplicityWait(driver, 10);
		
		LoginPage loginP = new LoginPage(driver);
		driver.get(pro.getDataFromProperty("url"));
		loginP.loginToApp(pro.getDataFromProperty("username"), pro.getDataFromProperty("password"));
		
	
		HomePage homeP = new HomePage(driver);
		homeP.getContactsLink().click();
		
		ContactsPage contactsP = new ContactsPage(driver);
		contactsP.getContactsPlusLink().click();
		
		ContactsInfoPage contactsIP = new ContactsInfoPage(driver);
		contactsIP.getLastNameTF().sendKeys(LastName);
		contactsIP.getSaveButton().click();
		
		CreatedCntPage createdCP = new CreatedCntPage(driver);
		wd.pageCreateConfirmationMsg(createdCP.getCreatedCntPageName().getText(), LastName);
		createdCP.getDeletePage().click();
		
		wd.switchToAlertAndAccept(driver, alertMsg);	
		
		int count =0;
		
		List<WebElement> listLastName = driver.findElements(By.xpath("(//a[@title='Contacts'])[position() mod 2 =0]"));
		for (WebElement lastNameEle : listLastName) {
			if(lastNameEle.equals(LastName)) {
				count++;
				break;
			}
		}
		
		if(count!=0)
			System.out.println("Contact "+LastName+" is not deleted and script Failed");
		else 
			System.out.println("Contact "+LastName+" is deleted and script Pass");
		
		wd.mouseOverOnElement(driver, homeP.getAdministratorSignout());
		homeP.getSignoutButton().click();
		
		driver.quit();
		System.out.println("Logout Successfully");
	}
}
