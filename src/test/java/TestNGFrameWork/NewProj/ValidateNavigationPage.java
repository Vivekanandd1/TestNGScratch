package TestNGFrameWork.NewProj;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class ValidateNavigationPage extends Base {
	
	public WebDriver driver;
	public LandingPage landingpage;
    public static Logger log = LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void Startdown() throws IOException {
		 driver=DriverInitializer();
		    landingpage=new LandingPage(driver);
			driver.get(prop.getProperty("url"));
//		    driver.get("http://www.qaclickacademy.com/");
			log.info("Driver initialized");
		
	}	
	
	@Test
	public void NavBarValidation() throws IOException
	{   
		
		Assert.assertTrue(landingpage.NavBar().isDisplayed());
		log.info("Validation is completed");
	}	
	
	@Test
	public void Teardown() throws InterruptedException{
		Thread.sleep(500);
	driver.quit();	
	log.info("Browser closed");
	}

}

