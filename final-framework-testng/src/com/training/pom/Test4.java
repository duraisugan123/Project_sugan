package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {
	private WebDriver driver; 
	
	public Test4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='Administration']")
	private WebElement adminlink; 
	
	@FindBy(xpath="//ul[@class='list-items-admin']//following::a[12]")
	private WebElement coursecategory;
		
	@FindBy(xpath="//img[@title='Add category']")
	private WebElement addcategory;
	
	@FindBy(id="course_category_code")
	private WebElement categorycode; 
	
	@FindBy(id="course_category_name")
	private WebElement categoryname; 
	
	@FindBy(xpath="//input[@name='auth_course_child'][1]")
	private WebElement radiobtn; 
	
	@FindBy(id="course_category_submit")
	private WebElement addcourse; 
	
	
	
		
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
		public void adminlink() {
		this.adminlink.click(); 
	}
		
		public void coursecategory() {
			this.coursecategory.click(); 
		}	
	
		public void addcategory() {			
			this.addcategory.click(); 
		}	
		
		public void categorycode(String categorycode) {
		this.categorycode.sendKeys(categorycode);
		}
		
		public void categoryname(String categoryname) {
			this.categoryname.sendKeys(categoryname);
			}
		
		public void radiobuttonclick() {
			if (radiobtn.isSelected()) {
				System.out.println("yes radio button is checked");
				
			} else {
				this.radiobtn.click();
			}
				
		}
		
		public void addcourse()
		{
			this.addcourse.click();
		}
}
