package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPrecedingSibling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String movieName="Uri";
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/sibling.html");
String position = driver.findElement(By.xpath("//td[contains(text(),'"+movieName+"')]/preceding-sibling::td")).getText();
		System.out.println(position);
	}
}