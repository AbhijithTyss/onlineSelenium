package testNG;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnAttributes {
	@Test(priority = -5,enabled = false)
	public void register() {
		Reporter.log("user registered successfully",true);
	}
	
	@Test(priority = -3,invocationCount = 4,threadPoolSize = 2)
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		Reporter.log("user logged in successfully",true);
	}
}