package com.qa.NoBrokerPages;


import org.openqa.selenium.support.PageFactory;

import com.qa.NoBrokerTest.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class HomePage extends BaseTest {
	
	   AppiumDriver<MobileElement> driver;
	  
	    public HomePage(AppiumDriver<MobileElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }




	@AndroidFindBy(id="com.nobroker.app:id/buyLayoutText")
	MobileElement buy;
	
	@AndroidFindBy(id="com.nobroker.app:id/searchEditHome")
	MobileElement clickOnSearch;
	
	@AndroidFindBy(id="android:id/text1")
	MobileElement clickOnDropDown;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	MobileElement select3rdIndex;
	
	@AndroidFindBy(id="com.nobroker.app:id/localityAutoCompleteTxt")
	MobileElement ele;
	
	@AndroidFindBy(id="com.nobroker.app:id/nearByRadio")
	MobileElement nearbyProperty;
	
	@AndroidFindBy(id="com.nobroker.app:id/bhktwo")
	MobileElement twoBHK;
	
	@AndroidFindBy(id="com.nobroker.app:id/bhkthree")
	MobileElement threeBHK;
	
	@AndroidFindBy(id="com.nobroker.app:id/searchProperty")
	MobileElement submit;
	
	
	public void buy() {
		buy.click();
	}
	public void clickOnSearch() {
		clickOnSearch.click();
	}
	public void clickOnDropDown() {
		clickOnDropDown.click();
	}
	public void select3rdIndex() throws InterruptedException {
		Thread.sleep(2000);
		select3rdIndex.click();
	}
	public void clickOnLocationSearch() throws InterruptedException {
		ele.sendKeys(pro.getProperty("location"));
		Thread.sleep(5000);


		TouchAction touchAction = new TouchAction(driver);
		int xTapped = ele.getLocation().getX()+  ele.getSize().getWidth();
		int yTapped = ele.getLocation().getY()+50 +  ele.getSize().getHeight() ;
		touchAction.tap(PointOption.point(xTapped, yTapped)).release().perform();
		Thread.sleep(5000);

		ele.sendKeys(pro.getProperty("location"));
		Thread.sleep(5000);
		touchAction.tap(PointOption.point(xTapped, yTapped+200)).release().perform();
	}
	public void nearbyProperty() {
		nearbyProperty.click();
	}
	public void twoBHK() {
		twoBHK.click();
	}
	public void threeBHK() {
		threeBHK.click();
	}
	public void submit() {
		submit.click();
	}
}
