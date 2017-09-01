package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHoKhauDeclare;
import genneral.ObjectQLNhanKhauDeclare;

public class NKThemVaoHK2 {
	public void kiemTraNutChonHoKhauKhongCHoCLickKhiNKDangLaChuHo(WebDriver driver) throws InterruptedException, IOException{
		timNhanKhau(driver, 8, 3);
		Thread.sleep(500);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnSua());
		Method.implicitlyWait(driver, 5);
		Boolean check = Method.elementEnable(driver, ObjectQLNhanKhauDeclare.btnChonHK());
		Assert.assertFalse(check);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongChonHK());
	}

	public void xoaDLNhanKhau(WebDriver driver) {
		try {
			Method.click(driver, ObjectQLHoKhauDeclare.btnQuanLyHoKhau());
			Method.senKey(driver, ObjectQLHoKhauDeclare.txtChuHo(), ExcelUntil.getData(9, 4));
			Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiem());
			Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
			try {
				Boolean xoa = Method.elementDisplay(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK2());
				while(xoa){
					Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoaNK2());
					Method.click(driver, ObjectQLHoKhauDeclare.btnDongYXoaNK2());
				}
			} catch (Exception e) {
				System.out.println("Khong tim thay nhan khau can xoa");
			}
			Method.implicitlyWait(driver, 5);
			Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
		} catch (Exception e) {
			System.out.println("Khong tim thay ho khau can tim");
		}
	}

	public void kiemTraThongBaoKhiChuaChonQHVoiChuHo(WebDriver driver) throws InterruptedException, IOException{
		xoaDLNhanKhau(driver);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnQuanLyNhanKhau());
		timNhanKhau(driver, 9, 3);
		Thread.sleep(3000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnSua());
		Thread.sleep(1000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnRefreshChonHK());

		Method.click(driver, ObjectQLNhanKhauDeclare.btnChonHK());

		Method.senKeyNotClear(driver, ObjectQLNhanKhauDeclare.txtChuHoChonHK(), ExcelUntil.getData(9, 4));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTimKiemChonHK());
		Method.click(driver, ObjectQLNhanKhauDeclare.btnThaoTacChonHK());
		Method.click(driver, ObjectQLNhanKhauDeclare.btnLuuChonHK());

		String getMessage = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathMessageChonHK());
		String message = ExcelUntil.getData(9, 7);
		Assert.assertEquals(message, getMessage);
//		Thread.sleep(7000);
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongChonHK());
	}

	public void timNhanKhau(WebDriver driver, int rowNum, int columNum) throws InterruptedException {
		Thread.sleep(500);		
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(rowNum, columNum));
		Thread.sleep(500);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTimKiemSearch());
	}

	public void themNKvaoHKKhiNKKhongLaChuHo(WebDriver driver) throws InterruptedException, IOException {
//		timNhanKhau(driver, 10, 3);
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnSua());
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnRefreshChonHK());
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnChonHK());
//		Method.senKeyNotClear(driver, ObjectQLNhanKhauDeclare.txtChuHoChonHK(), ExcelUntil.getData(10, 4));
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnTimKiemChonHK());
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThaoTacChonHK());
		Method.senKeyNotClear(driver, ObjectQLNhanKhauDeclare.dropQHVoiChuHoChonHK(), "CCC");
		Thread.sleep(2000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnLuuChonHK());
		soSanh(driver);
	}

	public void soSanh(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(2000);
		timNhanKhau(driver, 10, 3);
		Method.click(driver, ObjectQLNhanKhauDeclare.linkMaHoGDChonHK());
		String MaYTCNChuHo = ExcelUntil.getData(10, 5);
		String getMaYTCNChuHo = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathMaYTCNChuHoChonHK());
		String QHConChuHo = ExcelUntil.getData(10, 6);
		String getQHConChuHo = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathQHConChuHoChonHK());
		Assert.assertEquals(MaYTCNChuHo, getMaYTCNChuHo);
		Assert.assertEquals(QHConChuHo, getQHConChuHo);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongTTChiTiet());

	}

}
