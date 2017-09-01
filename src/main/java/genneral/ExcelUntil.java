package genneral;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUntil {
	private static XSSFWorkbook WBook;
	private static XSSFSheet FSheet;
	private static XSSFRow FRow;
	private static XSSFCell FCell; 
	public static void readExcel(String Path,  String Sheet) throws IOException {
		try {
			FileInputStream inputFile = new FileInputStream(Path);
			WBook = new XSSFWorkbook(inputFile);
			FSheet = WBook.getSheet(Sheet);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("k doc duoc file");
		}
	}

	public static  String getData(int RowNum, int ColumNum){
		try {
			FRow = FSheet.getRow(RowNum);
			FCell = FRow.getCell(ColumNum);
			String CellValue = FCell.getStringCellValue();
			return CellValue;
		} catch (Exception e) {
			return "";
		}
	}

	public static void setData(String Path, String Result, int RowNum, int ColumNum) throws IOException{
		FCell = FSheet.getRow(RowNum).getCell(ColumNum, FSheet.getRow(RowNum).RETURN_BLANK_AS_NULL);
		if(FCell == null){
			FCell = FRow.createCell(ColumNum);
			FCell.setCellValue(Result);
		}else{
			FCell.setCellValue(Result);
		}
		FileOutputStream fileOut = new FileOutputStream(Path);
		WBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

}
