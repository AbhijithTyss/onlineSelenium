package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("logged in seccessfully",true);
	}
	
	@Test
	public void register() {
		Reporter.log("registered seccessfully",true);
	}
	
	@Test(dependsOnMethods = {"login","register"})
	public void addToCart() {
		Reporter.log("added to cart seccessfully",true);
	}
}
