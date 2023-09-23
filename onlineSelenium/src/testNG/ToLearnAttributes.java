package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnAttributes {
	@Test(priority = -5)
	public void register() {
		Reporter.log("user registered successfully",true);
	}
	
	@Test(priority = -3)
	public void login() {
		Reporter.log("user logged in successfully",true);
	}
}