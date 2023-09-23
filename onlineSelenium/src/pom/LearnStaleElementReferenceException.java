package pom;

import java.io.Serial;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.skillrary.com/");
		HomePage hp=new HomePage(driver);
		hp.getSearchTF().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		hp.getSearchTF().clear();
	}
}