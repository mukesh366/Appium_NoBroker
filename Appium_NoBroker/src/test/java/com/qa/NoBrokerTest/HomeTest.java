package com.qa.NoBrokerTest;

import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.NoBrokerPages.HomePage;

public class HomeTest extends BaseTest {

	public HomeTest() {
		super();
	}
	HomePage homepage;

	@BeforeClass
	public void before() {

		try {
			initialisation();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	@Test
	public void homePageTest() throws InterruptedException {
		homepage=new HomePage(driver);
		homepage.buy();
		homepage.clickOnSearch();
		homepage.clickOnDropDown();
		homepage.select3rdIndex();
		homepage.clickOnLocationSearch();
		homepage.nearbyProperty();
		homepage.twoBHK();
		homepage.threeBHK();
		homepage.submit();

	}

	@AfterClass
	void teardown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}


}
