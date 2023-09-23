package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/products_page/91");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560011");
		WebElement checkButton = driver.findElement(By.id("Check"));
		WebDriverWait ewait=new WebDriverWait(driver, Duration.ofSeconds(1));
		ewait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}
}
