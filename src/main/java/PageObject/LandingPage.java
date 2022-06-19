package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By emailbox = By.xpath("//input[@name='email']");
	By PasswordBox = By.xpath("//input[@name=' password']");
	By signInBtn = By.xpath("//input[@type='submit']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
     
	public WebElement Mailid() {
		return driver.findElement(emailbox);
	}
	
	public WebElement  Passwrd() {
		return driver.findElement(PasswordBox);
	}
	public WebElement Getlogin() {
		return driver.findElement(signInBtn);
	}

}
