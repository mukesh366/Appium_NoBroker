package com.qa.NoBrokerPages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class search_ListPage{

	AppiumDriver<MobileElement> driver;

	public search_ListPage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	


	public void list() {
		ArrayList<String> list1=new ArrayList<String>();
		boolean condition = true;
		while(condition == true) {
			List<MobileElement> list = driver.findElementsById("com.nobroker.app:id/title");


			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).getText());
				list1.add(list.get(i).getText());
				if(list1.size()==4) {
					list.get(i).click();
					condition=false;
				}

			}
			scroll(driver, 0.5, 0.8, 0.5, 0.2);

		}

	}
	public static void scroll(AppiumDriver<MobileElement>driver, double start_xd, double start_yd, double end_xd,double end_yd) {
		Dimension dim=driver.manage().window().getSize();
		int start_x= (int) (dim.width*start_xd);
		int start_y=(int) (dim.height*start_yd);

		int end_x= (int) (dim.width*end_xd);
		int end_y=(int) (dim.height*end_yd);

		TouchAction touch=new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();

	}
}
