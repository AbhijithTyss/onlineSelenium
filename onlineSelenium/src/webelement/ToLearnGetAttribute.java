package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/");
		String altValue = driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).getAttribute("alt");
		System.out.println(altValue);
	}
}
