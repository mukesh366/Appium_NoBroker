package com.qa.NoBrokerTest;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.NoBrokerPages.HomePage;
import com.qa.NoBrokerPages.search_ListPage;

public class search_ListTest extends BaseTest{
	public search_ListTest() throws IOException {
		super();
	}
	HomePage homepage;
	search_ListPage listpage;

	@BeforeClass
	public void before() {

		try {
			initialisation();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	@BeforeMethod
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
	@Test
	public void ListTest() {
		listpage=new search_ListPage(driver);
		listpage.list();
	}

	@AfterClass
	void teardown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}

}
