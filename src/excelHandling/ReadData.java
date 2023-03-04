package excelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
	String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx";
	File file=new File(path);
	FileInputStream fis=new FileInputStream(file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
	XSSFRow row=sheet.getRow(4);
	XSSFCell cell=row.getCell(1);
	
	String data= cell.getStringCellValue();
	  System.out.println(data);
	  
	  //------------------
	  
	  
	  double data10=wb.getSheetAt(0).getRow(1).getCell(0).getNumericCellValue();
	  System.out.println(data10);
	  String data11=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
	  System.out.println(data11);
	  String data12=wb.getSheetAt(0).getRow(1).getCell(2).getStringCellValue();
	  System.out.println(data12);
	  
	  
	  
	  
	  
	  
	  
	}

}
