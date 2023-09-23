package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Dimension size = driver.findElement(By.id("username")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println("=====================================");
		Point location = driver.findElement(By.name("pwd")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		System.out.println("========================================");
		Rectangle rect = driver.findElement(By.id("loginButton")).getRect();
		System.out.println("height: "+rect.getHeight());
		System.out.println("width: "+rect.getWidth());
		System.out.println("x: "+rect.getX());
		System.out.println("y: "+rect.getY());
	}
}