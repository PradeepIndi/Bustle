package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomPage {
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampaignBtn;
	
	public DisplayingCustomPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}

	public void setNewCampaignBtn() {
		newCampaignBtn.click();
	}

}
