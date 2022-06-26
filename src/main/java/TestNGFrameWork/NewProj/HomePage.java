package TestNGFrameWork.NewProj;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.Base;

public class HomePage extends Base {
	
//	Base base = new Base();
	WebDriver driver;
	public Properties prop;
	public LandingPage landingpage;
	@BeforeTest
	public void Startdown() throws IOException {
		 driver=DriverInitializer();
		    landingpage=new LandingPage(driver);
//			driver.get(prop.getProperty("url"));
		    driver.get("http://www.qaclickacademy.com/");
		
	}	
	
//	@Test(dataProvider="getdata")TestNGFrameWork.NewProj.HomePage
	@Test
//	public void BasePageNaviagtion(String Username,String Password,String Text) throws IOException  {
	public void BasePageNaviagtion() throws IOException  {
//		landingpage.Signin().click();
//		landingpage.Mailid().sendKeys(Username);
//		landingpage.Passwrd().sendKeys(Password);
//		System.out.println(Text);
//		landingpage.Getlogin().click();
		landingpage.Title().getText();
		Assert.assertEquals(landingpage.Title().getText(), "FEATURED COURSES");
	}
	
//	@DataProvider
//	public Object[][] getdata() {
//		Object[][] data = new Object[2][3];
//		data[0][0] = "vivekanandd1@live.com";
//		data[0][1] = "Rony@11888";
//		data[0][2] = "Login Completed";
//		
//		data[1][0] = "fdsj@fjd.com";
//		data[1][1] = "Rfd11888";
//		data[1][2] = "second loop";
//		return data;
//	}
	
	@AfterTest
	public void Teardown() throws InterruptedException{
		Thread.sleep(1000);
	driver.quit();	
	}
	}
