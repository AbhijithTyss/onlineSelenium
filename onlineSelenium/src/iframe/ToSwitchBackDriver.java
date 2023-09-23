package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackDriver {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://petdiseasealerts.org/forecast-map/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='north-dakota']")).click();
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("SIGN UP")).click();
	}
}
