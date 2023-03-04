package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RightDataOnSheet {
	public static void main(String[]args) throws IOException{
		
	String path="C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx";
	File file=new File(path) ;
	FileInputStream fis=new FileInputStream (file);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	      
	   String username=  wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
	   System.out.println(username);
	   
	   wb.getSheetAt(0).getRow(1).createCell(3).setCellValue("passed");
	   wb.getSheetAt(0).getRow(2).createCell(3).setCellValue("passed");
	   wb.getSheetAt(0).getRow(3).createCell(3).setCellValue("passed");
	   wb.getSheetAt(0).getRow(4).createCell(3).setCellValue("passed");
	   
	   FileOutputStream fos=new FileOutputStream(file);
	   wb.write(fos);
	   
	   System.out.println("//hhftftfyhjissuuipi");
	
	
	

}
}