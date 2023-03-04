package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData3 {

	public static void main(String[] args) throws IOException {
		
		//System.out.println(readData1());
		String Data=readData1();
		System.out.println(Data);
		
		
		
	}
		
		//
		
		
		public static String readData1() throws IOException
		{
			
			String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx";
			File file =new File(path);
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook (fis);
String username =wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
return username;
		}
		


			

}
