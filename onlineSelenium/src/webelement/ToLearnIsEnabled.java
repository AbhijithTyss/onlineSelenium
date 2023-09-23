package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		boolean status1 = element.isEnabled();
		System.out.println("before entering data to the TF: "+status1);
//		element.click();
		
		driver.findElement(By.name("username")).sendKeys("abcdefg");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		boolean status2 = element.isEnabled();
		System.out.println("After sending data to the TF: "+status2);
		element.click();
	}
}
