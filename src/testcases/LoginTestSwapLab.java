package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestSwapLab {
	
	static String  Expected_outout="https://www.saucedemo.com/inventory.html";

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(getData("logindata1",1,0));
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(getData("logindata1",1,1));
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	
	String Actual_output=driver.getCurrentUrl();
	if(Actual_output.equals(Expected_outout))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	

	}
	public static String getData(String sheet_name,int row_num,int cell_num) throws IOException
	{
		String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\xyz.xlsx\\";
        File file=new File(path);
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
    //  String data=  wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num ).getStringCellValue();
        double data=  wb.getSheet(sheet_name).getRow(row_num).getCell(cell_num ).getNumericCellValue();
        int data1 =(int)data;
        String datas=String.valueOf(data1);
      return datas;
      
	}

}

