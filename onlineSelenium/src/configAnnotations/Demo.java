package configAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	@BeforeClass
	public void launchBrowser() {
		Reporter.log("browser launched successfully",true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("login successfull",true);
	}
	@Test
	public void demo() {
		Reporter.log("demo from Demo class Executed",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout successfull",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("browser closed successfully",true);
	}
	@Test
	public void sample() {
		Reporter.log("sample from Demo class Executed",true);
	}
}
