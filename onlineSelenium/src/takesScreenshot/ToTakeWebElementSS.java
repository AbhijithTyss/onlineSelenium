package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeWebElementSS {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		File srcFile = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshot/elementSS.png");
		FileHandler.copy(srcFile, destFile);
	}

}
