package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		File f = new File("F:\\excel\\staticdata.xlsx");
		Thread.sleep(1000);
		String city = WorkbookFactory.create(f).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();  //string
		System.out.println(city);
		//double num = WorkbookFactory.create(f).getSheet("sheet1").getRow(1).getCell(1).getNumericCellValue(); //number
		//System.out.println(num);
		// boolean value =WorkbookFactory.create(f).getSheet("sheet1").getRow(2).getCell(0).getBooleanCellValue(); //boolean
		 //System.out.println(value);
		String charValue = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue(); //character
		System.out.println(charValue);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Workbook filecreate = WorkbookFactory.create(f);
		Sheet sheet1 = filecreate.getSheet("Sheet1");
		Row row = sheet1.getRow(2);
		Cell column = row.getCell(1);
		CellType type = column.getCellType();
		System.out.println(type);

		System.out.println("++++++++++ by for loop +++++++++++++");
		Sheet mySheet1 = filecreate.getSheet("Sheet1");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 1; j++) {
				String noofrowandcolumn = mySheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(noofrowandcolumn+" ");
			}
			System.out.println();
		}

	}

}
