package ExcelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDynamic {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File excel=new File("F:\\excel\\staticdata.xlsx");
		Workbook data = WorkbookFactory.create(excel);
		Sheet sheet = data.getSheet("Sheet2");
		int totalnorow = sheet.getLastRowNum();
		
		short totalnocolumn = sheet.getRow(totalnorow).getLastCellNum();
		int columnCount=totalnocolumn-1;
		System.out.println(columnCount);
		int rowCount=totalnorow;
		System.out.println(rowCount);
		
//		CellType cell = sheet.getRow(2).getCell(1).getCellType();
//		System.out.println(cell);
		
		for(int i=0;i<=rowCount;i++) {
			for(int j=0;j<=columnCount;j++) {
				Cell mycell = sheet.getRow(i).getCell(j);
				//System.out.print(mycell);
				CellType dataType = mycell.getCellType();
				
				if(dataType==CellType.STRING) {
					String str=mycell.getStringCellValue();
					System.out.print(str+" ");
				}
				else if(dataType==CellType.NUMERIC) {
					double i1=mycell.getNumericCellValue();
					System.out.print(i1+" ");
				}
				else if(dataType==CellType.BOOLEAN) {
					boolean str=mycell.getBooleanCellValue();
					System.out.print(str+" ");
				
			}
				else if(dataType==CellType.BLANK) {
					
					System.out.print(" ");
				
			}
		}
		System.out.println();
		
		
		
	}}}
