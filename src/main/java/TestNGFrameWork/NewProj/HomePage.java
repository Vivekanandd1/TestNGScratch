package TestNGFrameWork.NewProj;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class HomePage extends Base {
	
//	Base base = new Base();
	WebDriver driver;

	
	@Test
	public void BasePageNaviagtion() throws IOException  {
	    driver=DriverInitializer();
	    LandingPage landingpage=new LandingPage(driver);
		driver.get("https://rahulshettyacademy.com/sign_in/");
		landingpage.Mailid().sendKeys("vivekanadd1@live.com");
		landingpage.Passwrd().sendKeys("Rony@11888");//Rony@11888
		landingpage.Getlogin().click();
	}
	
}
