package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeEntireWebPageSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting
		Thread.sleep(2000);
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//temp location
		
		File destFile=new File("./screenshot/image.jpeg");//permanent location
		
		FileHandler.copy(srcFile, destFile);//copy
	}
}