package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsDisplayed {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		boolean element = driver.findElement(By.xpath("//img[@alt='SkillRary']")).isDisplayed();
		System.out.println(element);
		if (element) {
			System.out.println("Navigated to web Application");
		} else {
			System.out.println("failed to Navigate");
		}
	}
}