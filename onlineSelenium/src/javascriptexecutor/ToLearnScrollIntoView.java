package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.naukri.com/registration/createAccount");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		WebElement mobileTF = driver.findElement(By.id("mobile"));
		js.executeScript("arguments[0].scrollIntoView(true)",mobileTF );
	}

}
