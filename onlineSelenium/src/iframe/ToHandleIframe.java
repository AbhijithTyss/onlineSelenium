package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleIframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//		driver.switchTo().frame(0);//by index
//		driver.switchTo().frame("login_page");//by name
		WebElement loginFrame = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(loginFrame);//by webelement
		driver.findElement(By.linkText("Forgot Customer ID")).click();
	}
}