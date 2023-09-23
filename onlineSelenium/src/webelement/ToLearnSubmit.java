package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnSubmit {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement usernameTxt = driver.findElement(By.id("username"));
		usernameTxt.clear();
		usernameTxt.sendKeys("abhijith");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
	}
}