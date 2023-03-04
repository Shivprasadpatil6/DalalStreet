package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData4WithArgumentData {

	
		

			public static void main(String[] args) throws IOException {
				
				//System.out.println(readData1());
				String Data=readData1(0,1,1);
				System.out.println(Data);
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login.php/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(readData1(0,2,1));
				driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys(readData1(0,2,2));
				
				
				
				
			}
				
				
				
				
				public static String readData1(int sheet_index,int row_num,int cell_num) throws IOException
				{
					
					String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx";
					File file =new File(path);
					FileInputStream fis=new FileInputStream(file);
					XSSFWorkbook wb=new XSSFWorkbook (fis);
		String username =wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		return username;
				}
				


					

		


	}


