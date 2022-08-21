package PageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.Base;

public class LandingPage {
	
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	By Signin = By.cssSelector("i.fa.fa-lock.fa-lg");
	By emailbox = By.xpath("//input[@name='email']");
	By PasswordBox = By.xpath("//input[@name=' password']");
	By signInBtn = By.xpath("//input[@type='submit']");
	By TextPrsnt = By.xpath("//h2[normalize-space()='Featured Courses']");
	By NavBar = By.cssSelector("ul.nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement Signin() {
		return driver.findElement(Signin);
		
	}
	
	public WebElement Title() {
		return driver.findElement(TextPrsnt);
	}
	
	public WebElement NavBar() {
		return driver.findElement(NavBar);
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
