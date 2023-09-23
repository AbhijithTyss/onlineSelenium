package webelement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LocalDateTime sysDate = LocalDateTime.now();
		String actDate = sysDate.toString().replace(":", "-").replace(".", "");
		System.out.println(actDate);
//		driver.get("https://www.instagram.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.name("username")).sendKeys("abcdefg");
//		driver.findElement(By.name("password")).sendKeys("abcd@123");
//		File src = driver.getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("./errorshots/image1"+time+".png"));
	}
}