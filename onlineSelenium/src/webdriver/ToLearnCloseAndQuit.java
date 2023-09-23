package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(10000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
//		driver.close();
		driver.quit();
	}
}