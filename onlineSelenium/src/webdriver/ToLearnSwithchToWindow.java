package webdriver;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnSwithchToWindow {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.partialLinkText("actiTIME")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		
		for(String wid:allwindowIds) {
			driver.switchTo().window(wid);
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String parentId = driver.getWindowHandle();
//		driver.findElement(By.linkText("actiTIME Inc.")).click();
//		Set<String> allWindowIds = driver.getWindowHandles();
////		allWindowIds.remove(parentId);
//		for(String wid:allWindowIds) {
//			driver.switchTo().window(wid);
//			String url = driver.getCurrentUrl();
//			if(url.equals("https://www.actitime.com/")) {
//				break;
//			}
//		}
//		System.out.println(driver.getTitle());
//		driver.quit();
	}
}
