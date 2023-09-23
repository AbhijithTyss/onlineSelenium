package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		Select priceListbox=new Select(listbox);
		priceListbox.selectByIndex(3);
		priceListbox.selectByValue("99");
		priceListbox.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
//		String text = priceListbox.getFirstSelectedOption().getText();
//		System.out.println(text);
		
		List<WebElement> allOptions = priceListbox.getAllSelectedOptions();
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
	}

}
