package configAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {
	@BeforeMethod
	public void login() {
		Reporter.log("login successfull",true);
	}
	@Test
	public void addToCart() {
		Reporter.log("addToCart executed",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout successfull",true);
	}
	@Test
	public void removeFromCart() {
		Reporter.log("removeFromCart executed",true);
	}
}
