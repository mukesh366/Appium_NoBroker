package com.qa.NoBrokerTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {

	public static AppiumDriver<MobileElement> driver;
	public void initialisation() throws MalformedURLException {
		
		DesiredCapabilities cab= new DesiredCapabilities();
		cab.setCapability("deviceName", "Redmi 6_Pro");
		cab.setCapability("udid", "4c88ce520905");
		cab.setCapability("platformName", "Android");
		cab.setCapability("platformVersion", "9");
		cab.setCapability("appPackage", "com.nobroker.app");
		cab.setCapability("automationName", "Appium");
		cab.setCapability("noReset","true");		

		cab.setCapability("unicodeKeyboard", "true");                                     
		cab.setCapability("resetKeyboard", "true");
		cab.setCapability("appActivity", "com.nobroker.app.activities.NBSplashScreen");
		URL url= new URL("http://127.0.0.1:4723/wd/hub");

		driver=new AndroidDriver<MobileElement>(url,cab);

		
		
		}
	public static Properties pro;
	public BaseTest(){
		 pro=new Properties();
			FileInputStream ip = null;
			try {
				ip = new FileInputStream("./config.property");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
 
		try {
			pro.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
	
	
}
