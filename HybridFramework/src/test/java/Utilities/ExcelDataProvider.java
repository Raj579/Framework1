package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataProvider(){
		
		File src= new File("D:\\Others\\My Eclipse Workspace\\HybridFramework\\Test Data\\ExcelData.xlsx");
		try {
			FileInputStream fyl= new FileInputStream(src);
			wb= new XSSFWorkbook(fyl);
		} catch (Exception e) {
			System.out.println("Unable to read LoginData Excel File: "+e.getMessage());
		}
	}
	
	public int getRowCount(int sheetindex){
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
	
	public String getStringValue(int sheetindex, int row, int col){
		
		sheet1=wb.getSheetAt(sheetindex);
		DataFormatter formatter=new DataFormatter();
		String data=formatter.formatCellValue(sheet1.getRow(row).getCell(col));
		return data;
		
		//return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	}
	
    public String getStringValue(String sheet, int row, int col){

    	sheet1=wb.getSheet(sheet);
		DataFormatter formatter=new DataFormatter();
		String data=formatter.formatCellValue(sheet1.getRow(row).getCell(col));
		return data;
		
		//return wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericCellValue(String sheet, int row, int col){

		return wb.getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();
		
	}

}
