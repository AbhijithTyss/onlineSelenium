package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNavigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.navigate().to(new URL("https://www.actitime.com/"));
		driver.navigate().back();
		driver.quit();
	}
}