package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();//locators
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String wID:allwindowIds) {
			System.out.println(wID);
		}
		System.out.println(driver.getTitle());
	}
}
