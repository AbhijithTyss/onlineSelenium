package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelectListbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		//to select date
		WebElement day = driver.findElement(By.id("day"));
		Select dayDropdown=new Select(day);
		dayDropdown.selectByIndex(7);
		//to select month
		WebElement month = driver.findElement(By.id("month"));
		Select monthDropdown=new Select(month);
		monthDropdown.selectByValue("3");
		//to select year
		WebElement year = driver.findElement(By.id("year"));
		Select yearDropdown=new Select(year);
		yearDropdown.selectByVisibleText("2016");
	}
}
