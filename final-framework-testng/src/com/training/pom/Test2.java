package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2 {
	private WebDriver driver; 
	
	public Test2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[@title='My courses']")
	private WebElement mycourse; 
	
	@FindBy(xpath="//img[@title='Java']")
	private WebElement javacourse;
	
	@FindBy(xpath="//img[@title='Course description']")
	private WebElement description;
	
	
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
	
		public void mycourse() {
		this.mycourse.click(); 
	}
		
		public void javacourse() {
		this.javacourse.click(); 
	}	
	
		public void coursedescription() {
			this.description.click(); 
		}		
	
}
