package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step1
		FileInputStream fis = new FileInputStream("./testdata/ExcelData.xlsx");

		// step2
		Workbook workbook = WorkbookFactory.create(fis);

		// step3
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);

		int number = (int) workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(number);

		LocalDateTime date = workbook.getSheet("Sheet1").getRow(1).getCell(4).getLocalDateTimeCellValue();
		System.out.println(date);
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getYear());

		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get(url); driver.findElement(By.id("username")).sendKeys(username);
		 * driver.findElement(By.name("pwd")).sendKeys(password);
		 * driver.findElement(By.id("loginButton")).click();
		 */

		/*
		 * int num = (int)
		 * workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		 * System.out.println(num);
		 * 
		 * LocalDateTime date =
		 * workbook.getSheet("Sheet1").getRow(1).getCell(4).getLocalDateTimeCellValue();
		 * System.out.println(date.getMonth());
		 * System.out.println(date.getDayOfMonth()); System.out.println(date.getYear());
		 * 
		 * boolean status =
		 * workbook.getSheet("Sheet1").getRow(1).getCell(5).getBooleanCellValue();
		 * System.out.println(status);
		 */
	}
}
