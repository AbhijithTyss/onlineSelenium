package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Kpmg {
	@Test(groups = "regression")
	public void runKpmg() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kpmg.com/xx/en/home.html");
	}
}
