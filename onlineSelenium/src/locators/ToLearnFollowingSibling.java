package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnFollowingSibling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String movieName="Uri";
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/sibling.html");
		String collection = driver.findElement(By.xpath("//td[contains(text(),'"+movieName+"')]/following-sibling::td")).getText();
		System.out.println(collection);
	}
}