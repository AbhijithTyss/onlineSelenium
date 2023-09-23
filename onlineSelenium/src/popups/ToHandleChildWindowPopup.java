package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("https://www.shoppersstack.com/products_page/1");
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId);
		for(String wid:allWindowIds) {
			driver.switchTo().window(wid);
			if (driver.getCurrentUrl().contains("ebay")) {
				driver.manage().window().maximize();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("abcd");
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//span[text()='buy now']")).click();
	}
}
