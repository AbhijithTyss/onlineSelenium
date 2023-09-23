package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		//get position
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());//9
		System.out.println(position.getY());//9
		//set position
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(150, 150));
	}
}