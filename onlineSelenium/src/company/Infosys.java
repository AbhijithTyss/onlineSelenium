package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Infosys {
	@Test(groups = "system")
	public void runInfosys() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.infosys.com/");
	}
}
