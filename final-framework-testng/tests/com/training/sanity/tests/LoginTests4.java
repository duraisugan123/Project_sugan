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
import com.training.pom.Test4;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests4 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private Test4 test4;

	@BeforeClass
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		test4 = new Test4(driver); 
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
		test4.sendUserName("admin");
		test4.sendPassword("admin@123");
		test4.clickLoginBtn(); 
		//screenShot.captureScreenShot("First");
		test4.adminlink();
		test4.coursecategory();
		Thread.sleep(2000);
		test4.addcategory();
		test4.categorycode("BL");
		test4.categoryname("Blended Learning");
		test4.radiobuttonclick();
		test4.addcourse();
	
	
		
		
			
		}
		
		
	}
	

		
		
	

