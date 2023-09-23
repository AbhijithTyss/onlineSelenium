package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFullScreen {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		
		Thread.sleep(2000);
		driver.get("https://www.skillrary.com/");
		driver.manage().window().fullscreen();
	}
}