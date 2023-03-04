package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData2 {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx";
		File file=new File(path) ;
		FileInputStream fis=new FileInputStream (file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String username=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		String password= wb.getSheetAt(0).getRow(1).getCell(2).getStringCellValue();
		System.out.println(password);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys(password);
		
	}

}
