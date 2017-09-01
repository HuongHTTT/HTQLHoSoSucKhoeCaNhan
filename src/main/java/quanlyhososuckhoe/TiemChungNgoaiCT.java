package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHSSucKhoeDeclare;

public class TiemChungNgoaiCT {
	public void timKiemMaYTCN(WebDriver driver, int rowNum, int columNum) {
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtMaYTCNSearch(), ExcelUntil.getData(rowNum, columNum));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnTimKiemSearch());
	}

	public void kiemTraNutLuuKhongChoPhepKhiBoTrongTruongBatBuoc(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(500);
		timKiemMaYTCN(driver, 12, 2);
		Thread.sleep(500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXemHS());
		Thread.sleep(3000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnMenu());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnTiemChung());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnThemMoiTiemChungNgoaiCT());
		Boolean ele = Method.elementEnable(driver, ObjectQLHSSucKhoeDeclare.btnLuuTrongCT());
		Assert.assertFalse(ele);
	}

	public void kiemTraThongBaoKhiNgayHenTiemNhoHonNgayChungNgua(WebDriver driver) throws InterruptedException, IOException {
		// timKiemMaYTCN(driver, 13, 2);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnXemHS());
		// Thread.sleep(5000);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnMenu());
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnTiemChung());
		// Method.click(driver,
		// DeclareObjectQLHSSucKhoe.btnThemMoiTiemChungNgoaiCT());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.dropLoaiVacXinTrongCT());
		Method.implicitlyWait(driver, 3);
		WebElement loaiVacXin = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathLoaiVacXinTrongCT());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(loaiVacXin));
		loaiVacXin.click();
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayTiemTrongCT(), ExcelUntil.getData(13, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTrongCT(), ExcelUntil.getData(13, 4));
		WebElement ele = driver.findElement(ObjectQLHSSucKhoeDeclare.dropChonMuiTiemTrongCT());
		Select element = new Select(ele);
		element.selectByValue("number:1");
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuTrongCT());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String message = ExcelUntil.getData(13, 8);
		Assert.assertEquals(message, getMessage);
		// Thread.sleep(10000);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnDongSSNgoaiCT());
	}

	public void kiemTraMauKhiCacTruowngBatBuocKhongHopLe(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnBoLoaiVacXinTrongCT());
		Method.clear(driver, ObjectQLHSSucKhoeDeclare.txtNgayTiemTrongCT());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnBoCoSoKCBTrongCT());
		WebElement khungLoaiVacXin = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungLoaiVacXinTrongCT());
		String getMauKhungLoaiVacXin = khungLoaiVacXin.getCssValue("border-bottom-color");
		WebElement khungNgayTiemTrongCT = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungNgayTiemTrongCT());
		String getMauKhungNgayTiemTrongCT = khungNgayTiemTrongCT.getCssValue("border-bottom-color");
		WebElement khungCoSoKCBTrongCT = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungBoCoSoKCBTrongCT());
		String getMauKhungCoSoKCBTrongCT = khungCoSoKCBTrongCT.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(14, 9);
		Assert.assertEquals(getMauKhungLoaiVacXin, mau);
		Assert.assertEquals(getMauKhungNgayTiemTrongCT, mau);
		Assert.assertEquals(getMauKhungCoSoKCBTrongCT, mau);
	}
	public void xoatiemChungNgoaiCT(WebDriver driver) {
		try {
			Boolean xoa2;
			do {
				Thread.sleep(2000);
				xoa2 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaSSNgoaiCT2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaSSNgoaiCT2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaOKSSNgoaiCT());
			} while (xoa2);

		} catch (Exception e) {
		}

		try {
			Boolean xoa;
			do {

				Thread.sleep(2000);
				xoa = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaSSNgoaiCT());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaSSNgoaiCT());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaOKSSNgoaiCT());
			} while (xoa);
		} catch (Exception e) {
		}
	}

	public void themKhiNhapDayDuThongTin(WebDriver driver) throws InterruptedException, IOException {
		// timKiemMaYTCN(driver, 14, 2);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnXemHS());
		// Thread.sleep(5000);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnMenu());
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnTiemChung());
		// ----------------dung khi chay theo
		// luong------------------------------------
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongSSNgoaiCT());
		// --------------------------------------------------------------------------------

		xoatiemChungNgoaiCT(driver);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnThemMoiTiemChungNgoaiCT());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.dropLoaiVacXinTrongCT());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.xpathLoaiVacXinTrongCT());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayTiemTrongCT(), ExcelUntil.getData(14, 3));

		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTrongCT(), ExcelUntil.getData(14, 4));
		WebElement ele = driver.findElement(ObjectQLHSSucKhoeDeclare.dropChonMuiTiemTrongCT());
		Select element = new Select(ele);
		element.selectByValue("number:1");
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuTrongCT());
		soSanh(driver);
	}

	public void soSanh(WebDriver driver) throws IOException, InterruptedException {
		String loaiVacXin = ExcelUntil.getData(15, 7);
		String getLoaiVacXin = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathLoaiVacXinSSNgoaiCT());

		String ngayChungNgua = ExcelUntil.getData(15, 3);
		String getNgayChungNgua = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathNgayChungNguaSSNgoaiCT());

		String muiTiem = ExcelUntil.getData(15, 5);
		String getMuiTiem = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMuiTiemSSNgoaiCT());

		String ngayHenTiem = ExcelUntil.getData(15, 4);
		String getNgayHenTiem = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathNgayChungNguaSSNgoaiCT());

		Assert.assertEquals(loaiVacXin, getLoaiVacXin);
		Assert.assertEquals(ngayChungNgua, getNgayChungNgua);
		Assert.assertEquals(muiTiem, getMuiTiem);
		Assert.assertEquals(ngayHenTiem, getNgayHenTiem);

	}

	public void kiemTraThongBaoKhiNhapThongTinTruocDoDaCo(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(5000);
		// timKiemMaYTCN(driver, 15, 2);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnXemHS());
		// Thread.sleep(5000);
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnMenu());
		// Method.click(driver, DeclareObjectQLHSSucKhoe.btnTiemChung());
		// Method.implicitlyWait(driver, 3);
		Boolean check = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnThemMoiTiemChungNgoaiCT());
		if(check){ 
			Thread.sleep(1000);
			Method.click(driver, ObjectQLHSSucKhoeDeclare.btnThemMoiTiemChungNgoaiCT());
		}
		Method.click(driver, ObjectQLHSSucKhoeDeclare.dropLoaiVacXinTrongCT());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.xpathLoaiVacXinTrongCT());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayTiemTrongCT(), ExcelUntil.getData(16, 3));

		Thread.sleep(2000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTrongCT(), ExcelUntil.getData(16, 4));
		WebElement ele = driver.findElement(ObjectQLHSSucKhoeDeclare.dropChonMuiTiemTrongCT());
		Select element = new Select(ele);
		element.selectByValue("number:1");
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuTrongCT());
		Thread.sleep(1000);
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String message = ExcelUntil.getData(16, 8);
		Thread.sleep(1000);
		Assert.assertEquals(message, getMessage);
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongSSNgoaiCT());
	}
}
