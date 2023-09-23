package webelement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnIsSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.xpath("//option[contains(text(),'INR 200 - INR 299')]"));
		System.out.println("before clicking on element: "+ele.isSelected());
		ele.click();
		System.out.println("after clicking on element: "+ele.isSelected());
		driver.close();
	}
}
