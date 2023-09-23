package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String errorMsg = driver.findElement(By.xpath("(//span[@class='errormsg'])[1]")).getText();
		System.out.println(errorMsg);
		if (errorMsg.contains("Password is invalid")) {
			System.out.println("Error msg is appeared");
		}else {
			System.out.println("failed to get Error msg");
		}
	}
}
