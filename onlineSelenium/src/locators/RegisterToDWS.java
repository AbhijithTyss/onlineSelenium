package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterToDWS {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Abhijith");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).sendKeys("abcd1234567@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcd@1234");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		driver.quit();
	}

}
