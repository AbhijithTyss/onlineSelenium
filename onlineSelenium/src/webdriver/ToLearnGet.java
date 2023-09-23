package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLearnGet {

	public static void main(String[] args) {	
		
		ChromeDriver driver=new ChromeDriver();
		//to navigate
//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");//fully qualified path
		String titleOfThePage = driver.getTitle();
		if (titleOfThePage.contains("Online Shopping")) {
			System.out.println("Successfully navigated to amazon");
		}else {
			System.out.println("Failed to navigate");
		}
		System.out.println(driver.getTitle());
	}
}
