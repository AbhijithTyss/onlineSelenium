package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Accenture {
	@Test(groups = {"smoke","fuctionality"})
	public void runAccenture() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.accenture.com/");
		Reporter.log("accenture launched",true);
	}
}
