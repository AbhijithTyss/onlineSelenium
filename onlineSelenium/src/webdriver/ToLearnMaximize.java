package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnMaximize {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//method chaining
		
		Thread.sleep(2000);
		driver.get("https://www.skillrary.com/");
		driver.manage().window().minimize();
		
//		Options man = driver.manage();
//		Window win = man.window();
//		win.maximize();
	}
}