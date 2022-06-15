package TestNGFrameWork.NewProj;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class HomePage extends Base{
	
	@Test
	public void BasePageNaviagtion() throws IOException {
		driver=DriverInitializer();
		driver.get("https://demo.opencart.com/");
	}

}
