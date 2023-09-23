package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultiSelectListbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		Select priceListbox=new Select(listbox);
		priceListbox.selectByIndex(0);
		priceListbox.selectByValue("199");
		priceListbox.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		System.out.println(priceListbox.isMultiple());
		Thread.sleep(2000);
		priceListbox.deselectByIndex(0);
		priceListbox.deselectByValue("199");
		priceListbox.deselectByVisibleText("INR 300 - INR 399 ( 1 )");
		priceListbox.deselectAll();
	}

}
