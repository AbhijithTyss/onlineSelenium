package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Wipro {
	@Test(groups = "smoke")
	public void runKpmg() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
	}
}