package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeTimeBasedSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting
		
		LocalDateTime sysTime = LocalDateTime.now();//to capture system date and time
		String actualSysTime = sysTime.toString().replace(":", "_");//replace :
		System.out.println(sysTime);
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);//temp location
		System.out.println(srcFile);
		
		File destFile=new File("./screenshot/"+actualSysTime+".jpeg");//permanent location
		
		FileHandler.copy(srcFile, destFile);//copy
		Thread.sleep(15000);
		driver.quit();
	}
}