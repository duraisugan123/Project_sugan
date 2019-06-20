package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	private WebDriver driver; 
	
	public Test1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
	private WebElement course; 
	
	@FindBy(xpath="//div[@class='input-group']//following::input[1]")
	private WebElement textbox1;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@title='Subscribe']")
	private WebElement subscribe;
	
	
	
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
	
		public void coursecatalog() {
		this.course.click(); 
	}
		
		public void searchcourse(String textbox1) {
			this.textbox1.clear(); 
			this.textbox1.sendKeys(textbox1); 
		}
	
		public void clickonsubmit() {
			this.submit.click(); 
		}
		
		public void clickonsubscribe() {
			this.subscribe.click(); 
		}
}
