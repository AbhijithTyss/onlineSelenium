package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnSendKeys {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Courses']")).sendKeys("selenium",Keys.ENTER);
	}
}