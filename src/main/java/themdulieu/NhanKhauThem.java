package themdulieu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genneral.Method;
import genneral.ObjectQLNhanKhauDeclare;

public class NhanKhauThem {
	public static void chonDiaChi(WebDriver driver) {
		Method.click(driver, ObjectQLNhanKhauDeclare.dropTinhKhaiSinh());
		Method.click(driver, ObjectQLNhanKhauDeclare.xpathCanTho());
		// Method.click(driver, ObjectQLNhanKhauDeclare.dropTinhThanhPho());
		// Method.click(driver, ObjectQLNhanKhauDeclare.xpathHaNoi());
		// Method.click(driver, ObjectQLNhanKhauDeclare.dropHuyen());
		// Method.click(driver, ObjectQLNhanKhauDeclare.xpathHuyen());
		// Method.click(driver, ObjectQLNhanKhauDeclare.dropPhuongXa());
		// Method.click(driver, ObjectQLNhanKhauDeclare.xpathPhuongXa());
	}

	public static XSSFWorkbook FWBook;
	public static XSSFSheet FSheet;
	public static XSSFRow FRow;
	public static XSSFCell FCell;

	public static void opendExcel(WebDriver driver, String Path, String Sheet) throws IOException, InterruptedException {
		Thread.sleep(1000);
		FileInputStream fileInput = new FileInputStream(Path);
		FWBook = new XSSFWorkbook(fileInput);
		FSheet = FWBook.getSheet(Sheet);
		for (int i = 8; i <= 11; i++) {
			Thread.sleep(6000);

			Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
			Thread.sleep(1000);
				Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), getData(i, 2));
			if(i == 8){
			Method.click(driver, ObjectQLNhanKhauDeclare.radioButtonGioiTinhNu());
			}
			Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), getData(i, 3));
//			Thread.sleep(1000);  
            chonDiaChi(driver);
//            Method.implicitlyWait(driver, 5);
            WebElement btnTiepTuc = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
            WebDriverWait wait = new WebDriverWait(driver, 25);
    		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(btnTiepTuc));
    		btnTiepTuc.click();
            Thread.sleep(7000);  
    		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtDiaChiHienTai(),getData(i, 4));
    		Method.click(driver, ObjectQLNhanKhauDeclare.dropBoxThonXom());
    		Method.click(driver, ObjectQLNhanKhauDeclare.xpathThonXom());
    		Thread.sleep(2000);
    		Method.click(driver, ObjectQLNhanKhauDeclare.checkBoxDiaChi());
    		Thread.sleep(2000);
    		Method.click(driver, ObjectQLNhanKhauDeclare.btnLuuHoSo());
    		Thread.sleep(1000);
    		String Text = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathMessageThanhCong());
		}
	}

	public static String getData(int rowNum, int colNum) {
		FCell = FSheet.getRow(rowNum).getCell(colNum);
		DataFormatter format = new DataFormatter();
		String CellValue = format.formatCellValue(FCell);
		return CellValue;
	}

	public static void setData(int rowNum, int colNum, String result, String path) throws IOException {
		FRow = FSheet.getRow(rowNum);
		FCell = FRow.getCell(colNum, FRow.RETURN_BLANK_AS_NULL);
		if (FCell == null) {
			FCell = FRow.createCell(colNum);
			FCell.setCellValue(result);
		} else {
			FCell.setCellValue(result);
		}
		FileOutputStream fileOut = new FileOutputStream(path);
		FWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

}
