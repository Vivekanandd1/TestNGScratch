package TestNGFrameWork.NewProj;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public void DriverInitializer() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sony\\eclipse-workspace\\NewProj\\src\\main\\java\\TestNGFrameWork\\NewProj\\Data,properties");
		prop.load(fis);
		
		String Browsername = prop.getProperty("browser");
		
		if(Browsername=="chrome") {
			WebDriver driver = new ChromeDriver();
		}
		else if(Browsername=="firefox") {
			WebDriver driver = new FirefoxDriver();
		}
		else if(Browsername=="edge") {
			WebDriver driver = new EdgeDriver();
		}
	}

}
