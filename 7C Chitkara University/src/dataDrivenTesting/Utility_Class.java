package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class {

	public static String getPropertyValue(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/commandata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static String getExcelData(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/testscriptdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		Row rows = sheet.getRow(row);
		Cell cells = rows.getCell(cell);
		return cells.getStringCellValue();
		
	}
}
