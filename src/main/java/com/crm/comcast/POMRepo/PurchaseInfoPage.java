package com.crm.comcast.POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseInfoPage {
public PurchaseInfoPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	@FindBy (name = "subject")
     private WebElement subjectname;

	public WebElement getPurchasePlus() {
		return subjectname;
	}
	

}
