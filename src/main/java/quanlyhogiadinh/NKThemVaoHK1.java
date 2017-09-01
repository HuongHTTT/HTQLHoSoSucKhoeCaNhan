package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHoKhauDeclare;

public class NKThemVaoHK1 {
	private HoKhauThemMoi themHK = new HoKhauThemMoi();
	public void kiemTraThongBaoKhiBoTrongThongTin(WebDriver driver) {
		themHK.timKiemChuHo(driver, 7, 2);
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(7, 6);
		Assert.assertEquals(Text, ExpertedResult);
	}

	public void kiemTraThongBaoKhiBoTrongNhanKhau(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 10);

		//		themHK.timKiemChuHo(driver, 8, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Con");
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(8, 6);
		Assert.assertEquals(Text, ExpertedResult);
	}

	public void kiemTraMauKhungKhiBoTrongQHVoiChuHo(WebDriver driver) throws InterruptedException {
		//		themHK.timKiemChuHo(driver, 9, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("");
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.xpathMHThemNKVaoHK());
		WebElement element = Method.findElement(driver, ObjectQLHoKhauDeclare.xpathKhungQHVoiChuHo());
		String getMauKhung = element.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(9, 7);
		Assert.assertEquals(getMauKhung, mau);
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemNK());
	}

	public void kiemTraThongBaoKhiKhongChonQHVoiChuHo(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(1000);
		//		themHK.timKiemChuHo(driver, 9, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(10, 4));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(10, 6);
		Assert.assertEquals(Text, ExpertedResult);
	}

	public void kiemTraThongBaoKhiNKDangLaChuHoCuaHoKhac(WebDriver driver) throws InterruptedException, IOException {
		//		themHK.timKiemChuHo(driver, 11, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());		
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(11, 4));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Vợ");
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(11, 6);
		Assert.assertEquals(Text, ExpertedResult);
	}

	public void themNKVaoHKKhiDangLaThanhVienCuaHoKhac(WebDriver driver) throws InterruptedException, IOException {
		//		themHK.timKiemChuHo(driver, 12, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());		
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(12, 4));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Vợ");
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		Method.implicitlyWait(driver, 10);
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageChuyenHoKhau());
		String ExpertedResult = ExcelUntil.getData(12, 6);
		Assert.assertEquals(Text, ExpertedResult);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongChuyenHoKhau());
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemNK());
		Thread.sleep(500);
		WebElement element = Method.findElement(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
		Boolean check = element.isDisplayed();
		if(check){
			element.click();
		}
	}

	public void xoaDLNhanKhau(WebDriver driver) {
		try {
			Thread.sleep(500);
			Boolean xoa = Method.elementDisplay(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK2());
			while(xoa){
				Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK2());
				Method.click(driver, ObjectQLHoKhauDeclare.btnDongYXoaNK2());
			}
		} catch (Exception e) {
			System.out.println("Khong tim thay nhan khau can xoa");
		}
	}

	public void themNKVaoHKKhiChuaLaThanhVienCuaHoKhac(WebDriver driver) throws InterruptedException, IOException {
		themHK.timKiemChuHo(driver, 13, 2);
		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		xoaDLNhanKhau(driver);
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(13, 4));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Vợ");
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		soSanhThemNK(driver);
	}

	public void soSanhThemNK(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(5000);
		Method.click(driver, ObjectQLHoKhauDeclare.linkNK());
		Thread.sleep(3000);
		String getmaYTCN = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(13, 4);
		String getQHChuHo = Method.getText(driver, ObjectQLHoKhauDeclare.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(13, 5);
		Assert.assertEquals(maYTCN, getmaYTCN);
		Assert.assertEquals(qHChuHo, getQHChuHo);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDong());
		//		Thread.sleep(5000);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
	}

	public void kiemTraThongBaoKhiNKDaTonTaiTrongHK(WebDriver driver) throws InterruptedException, IOException {
		//		themHK.timKiemChuHo(driver, 14, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(14, 4));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		WebElement ele = Method.findElement(driver, ObjectQLHoKhauDeclare.dropQHVoiChuHo());
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Vợ");
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(14, 6);
		Assert.assertEquals(Text, ExpertedResult);
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemNK());
	}

	public void kiemTraKhiClickNutSuaNKDangLaChuHoKhongChoPhepSua(WebDriver driver) throws InterruptedException{
		//		themHK.timKiemChuHo(driver, 15, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		String alertText = "";
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSuaNK1());
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		String message = ExcelUntil.getData(15, 6);
		Assert.assertEquals(alertText, message);
	}

	public void kiemTraKhiClickNutXoaNKDangLaChuHoKhongChoPhepXoa(WebDriver driver) throws InterruptedException{
		//		themHK.timKiemChuHo(driver, 16, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		String alertText = "";
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK1());
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		alert.accept();
		String message = ExcelUntil.getData(16, 6);
		Assert.assertEquals(alertText, message);
	}

	public void kiemTraThongBaoKhiClickNutSuaNKKhongLaChuHo(WebDriver driver) throws InterruptedException {
		//		themHK.timKiemChuHo(driver, 17, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSuaNK2());
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		String getMessage = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String message = ExcelUntil.getData(17, 6);
		Assert.assertEquals(getMessage, message);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
	}

	public void kiemTraThongBaoKhiClickNutXoaNKKhongLaChuHo(WebDriver driver) throws InterruptedException {
		//				themHK.timKiemChuHo(driver, 18, 2);
		//				Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Thread.sleep(500);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK2());
		Method.implicitlyWait(driver, 10);
		String getMessage = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageXacNhanXoa());
		String message = ExcelUntil.getData(18, 6);
		Assert.assertEquals(getMessage, message);
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongXoaHoKhau());
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
	}

	public void kiemTraThongBaoClickNutLuuKhiDuLieuKhongDoi(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 10);
		themHK.timKiemChuHo(driver, 19, 2);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuu());
		String getMessage = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String message = ExcelUntil.getData(19, 6);
		Assert.assertEquals(getMessage, message);
	}

	public void kiemTraClickNutDongMHSuaSangMHQLyHK(WebDriver driver) {
		//		themHK.timKiemChuHo(driver, 20, 2);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
		Boolean check = Method.elementDisplay(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Assert.assertTrue(check);
	}
}
