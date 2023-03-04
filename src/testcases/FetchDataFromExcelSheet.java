package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFromExcelSheet {
	public static void main(String[]args) throws IOException
	{
		String path="\\C:\\Users\\Lenovo\\Desktop\\17septEB\\ExcelFolder\\logindata.xlsx\\";
        File file=new File(path);
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        
        
        for(int i=0;i<=6;i++)
        {
        	for(int j=0;j<=2;j++)
        	{
        		String data=wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
        		System.out.print(data + " ");
        	}
        	System.out.println();
        }
    ;
	

}
}
