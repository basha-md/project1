package Package1.SeleniumProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataFormatEXcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\BASHA\\eclipse-workspace\\Selenium\\TestData\\Ashraf.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
	      String mobilenumber =    wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	       //String mobilenumber =    NumberToTextConverter.toText(wb.getSheet("login").getRow(6).getCell(1).getNumericCellValue());
	       
	       
        System.out.println(mobilenumber);

	}

}
