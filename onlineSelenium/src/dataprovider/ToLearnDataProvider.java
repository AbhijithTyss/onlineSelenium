package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {
	@DataProvider
	public String[] data() {
		String[] testdata= {"admin","manager","Abhijith","test"};
		return testdata;
	}
	
	@Test(dataProvider = "data")
	public void login(String cred) throws InterruptedException {//test case
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println(cred);
		System.out.println("--------------------------------------");
		
		
//		driver.get("https://demo.actitime.com/login.do");
//		driver.findElement(By.name("username")).sendKeys(cred[0]);
//		driver.findElement(By.name("pwd")).sendKeys(cred[1]);
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(3000);
	}
}
