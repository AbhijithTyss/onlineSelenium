package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("browser launched and maximized",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://demo.actitime.com/login.do");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login","login page is not displayed");
		Reporter.log("login page is displayed",true);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track","home page is not displayed");
		Reporter.log("home page is displayed",true);
	}
}