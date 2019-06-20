package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Test1;
import com.training.pom.Test2;
import com.training.pom.Test3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests3 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private Test3 test3;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		test3 = new Test3(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		
	}

	/*@BeforeMethod
	public void setUp() throws Exception {
		
	}*/
	
	/*@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	
	@Test
	public void validLoginTest() throws InterruptedException {
		test3.sendUserName("suganya");
		test3.sendPassword("sugan123");
		test3.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
		Thread.sleep(2000);
		test3.dropdownclick();
		test3.logoutbutton();
		
	}
	

		
		
	
}
