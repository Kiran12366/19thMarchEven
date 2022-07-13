package UtilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class KiteAppUtilityClass {
//excelsheet
//screenshot
//closing
	public static String ExcelSheet(int row,int cell) throws EncryptedDocumentException, IOException {
		File f = new File("F:\\excel\\Account.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("sheet1");
		String value=mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
