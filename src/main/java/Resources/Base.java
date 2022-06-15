package Resources;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	
	public WebDriver DriverInitializer() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sony\\eclipse-workspace\\NewProj\\src\\main\\java\\TestNGFrameWork\\NewProj\\Data,properties");
		prop.load(fis);
		
		String Browsername = prop.getProperty("browser");
		
		if(Browsername.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		else if(Browsername.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

}
