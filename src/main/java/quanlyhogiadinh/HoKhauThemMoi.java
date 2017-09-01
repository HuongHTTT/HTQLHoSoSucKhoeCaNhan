package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHoKhauDeclare;

public class HoKhauThemMoi {
	public void kiemTraChucNangNutDong(WebDriver driver) {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemChuHo());
		Method.implicitlyWait(driver, 5);
		Boolean check = Method.elementDisplay(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Assert.assertTrue(check);
	}

	public void kiemTraNutTaoMoiHoKhauKhongChoClick(WebDriver driver) {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.implicitlyWait(driver, 5);
		Boolean check = Method.elementEnable(driver, ObjectQLHoKhauDeclare.btnTaoMoiHK());
		Assert.assertFalse(check);
	}

	public void kiemTraThongBaoKhiClickNutLuuKhiChuaChonChuHo(WebDriver driver) {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		//		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuu());
		String getMessage = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String message = ExcelUntil.getData(10, 5);
		Assert.assertEquals(getMessage, message);
	}

	public void kiemTraThongBaoKhiChonNKLaChuHoCuaHoKhac(WebDriver driver) throws InterruptedException, IOException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.click(driver, ObjectQLHoKhauDeclare.dropChuHo());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(11, 3));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(11, 5);
		Assert.assertEquals(Text, ExpertedResult);
		Thread.sleep(6000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongChonChuHo());
		//		Thread.sleep(1000);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemChuHo());
	}

	public void kiemTraThongBaoKhiChonNKDangCoQHVoiHoKhacLamChuHo(WebDriver driver) throws InterruptedException, IOException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.click(driver, ObjectQLHoKhauDeclare.dropChuHo());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(12, 3));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageChuyenHoKhau());
		String ExpertedResult = ExcelUntil.getData(12, 5);
		Assert.assertEquals(Text, ExpertedResult);
		Method.click(driver, ObjectQLHoKhauDeclare.btnHuyTachKhau());
		//		Thread.sleep(1000);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemChuHo());
	}

	public void kiemTraThongBaoKhiBoTrongDiaChiCuaChuHo(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(1000);
		//		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.click(driver, ObjectQLHoKhauDeclare.dropChuHo());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(13, 3));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnBoDiaChiChuHo());
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuu());

		String Text = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageLoiChonChuHo());
		String ExpertedResult = ExcelUntil.getData(13, 5);
		Assert.assertEquals(Text, ExpertedResult);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemChuHo());
	}

	public void timKiemChuHo(WebDriver driver, int rowNum, int columNum) {
		try {
			Method.senKey(driver, ObjectQLHoKhauDeclare.txtChuHo(), ExcelUntil.getData(rowNum, columNum));
			Method.click(driver, ObjectQLHoKhauDeclare.dropThonXom());
			Method.click(driver, ObjectQLHoKhauDeclare.xpathThonXom());
			Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiem());
		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho nay");
		}
	}

	public void xoaChuHo(WebDriver driver, int rowNum, int columNum) {
		try {
			timKiemChuHo(driver, rowNum, columNum);
			Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoa());
			Method.click(driver, ObjectQLHoKhauDeclare.btnXoa());
		} catch (Exception e) {
			System.out.println("Khong xoa duoc chu ho");
		}
	}

	public void themHKVoiNKChuaLamChuHo(WebDriver driver) throws InterruptedException, IOException{
		Method.implicitlyWait(driver, 5);
		xoaChuHo(driver, 14, 2);
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.click(driver, ObjectQLHoKhauDeclare.dropChuHo());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(14, 3));
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuu());
		soSanhChuHo(driver);
	}

	public void soSanhChuHo(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(1000);		
		Method.click(driver, ObjectQLHoKhauDeclare.linkChuHo());
		Thread.sleep(2000);
		String getmaYTCN = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(14, 3);

		String getQHChuHo = Method.getText(driver, ObjectQLHoKhauDeclare.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(14, 4);

		Assert.assertEquals(maYTCN, getmaYTCN);
		Assert.assertEquals(qHChuHo, getQHChuHo);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDong());
	}

	public void kiemTraClickNutTaoMoiHoKhauSangMHThemMoiHoKhau(WebDriver driver){
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnTaoMoiHK());
		String getElement = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMHThemMoiHK());
		String element = ExcelUntil.getData(15, 6);
		Assert.assertEquals(getElement, element);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongThemChuHo());
	}

	public void KiemTraClickNutXemChiTietVaoManHinhXemChiTiet(WebDriver driver) {
		Method.implicitlyWait(driver, 5);
		timKiemChuHo(driver, 16, 2);
		try {
			Method.click(driver, ObjectQLHoKhauDeclare.btnXemChiTiet());
			String getText = Method.getText(driver, ObjectQLHoKhauDeclare.xpathXemChiTiet());
			String text = ExcelUntil.getData(16, 6);
			Assert.assertEquals(getText, text);
			Method.click(driver, ObjectQLHoKhauDeclare.btnDongXemChiTiet());
		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho de xem thong tin chi tiet");
		}
	}

	public void KiemTraThongBaoKhiClickNutXoaHoKhau(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		timKiemChuHo(driver, 17, 2);
		try {
			Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoa());
			String getText = Method.getText(driver, ObjectQLHoKhauDeclare.xpathmessageXacNhanXoa());
			String text = ExcelUntil.getData(17, 5);
			Assert.assertEquals(getText, text);
			Method.click(driver, ObjectQLHoKhauDeclare.btnDongXoaHoKhau());
		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho de xoa"); 
		}
	}
	
	public void KiemTraClickNutSuaHoKhauVaoMHSuaHoKhau(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		timKiemChuHo(driver, 18, 2);
		try {
			Method.click(driver, ObjectQLHoKhauDeclare.btnChinhSuaHK());
			String getText = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMHThemMoiHK());
			String text = ExcelUntil.getData(18, 6);
			Assert.assertEquals(getText, text);
			Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho de sua"); 
		}
	}

}
