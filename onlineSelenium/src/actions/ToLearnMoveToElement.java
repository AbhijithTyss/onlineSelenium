package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMoveToElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();//to remove overlay
		
		WebElement sofa = driver.findElement(By.linkText("Sofas"));
		Actions act=new Actions(driver);
		act.moveToElement(sofa).perform();//to mouse hover
		driver.findElement(By.linkText("Wooden Sofas")).click();
	}
}