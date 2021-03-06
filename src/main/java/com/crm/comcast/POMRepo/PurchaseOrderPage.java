package com.crm.comcast.POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseOrderPage {
public PurchaseOrderPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "//img [@src='themes/softed/images/btnL3Add.gif']")
     private WebElement purchasePlus;

	public WebElement getPurchasePlus() {
		return purchasePlus;
	}
	

}
