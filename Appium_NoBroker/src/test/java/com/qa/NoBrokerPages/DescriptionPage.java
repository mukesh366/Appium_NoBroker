package com.qa.NoBrokerPages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DescriptionPage {
	
	AppiumDriver<MobileElement> driver;

	public DescriptionPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	
	@AndroidFindBy(id="com.nobroker.app:id/description")
	MobileElement description;
	
	
	public void description() {
		String dec=description.getText();
	 if(dec.isEmpty()) {
   	  System.out.println("Test Case Fail"); 
     }
     else {
   	  System.out.println("Test Case Pass");
     }

}
}
