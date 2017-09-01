package quanlyhososuckhoe;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHSSucKhoeDeclare;

public class HSSucKhoeTaoLap {
	public void timKiemMaYTCN(WebDriver driver, int rowNum, int columNum) {
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtMaYTCNSearch(), ExcelUntil.getData(rowNum, columNum));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnTimKiemSearch());
	}

	public void kiemTraThongBaoClickNutLuuKhiChuaThayDoiThongTin(WebDriver driver) throws IOException, InterruptedException {
		Thread.sleep(500);
		timKiemMaYTCN(driver, 12, 2);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuu());
		Method.implicitlyWait(driver, 5);
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String message = ExcelUntil.getData(12, 6);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiNgayKhamLonHonNgayHienTai(WebDriver driver) throws InterruptedException, IOException {
		//Thread.sleep(500);
		//timKiemMaYTCN(driver, 13, 2);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKham(), ExcelUntil.getData(13, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtBSKham(), ExcelUntil.getData(13, 4));
		Method.implicitlyWait(driver, 10);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuu());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String message = ExcelUntil.getData(13, 6); 
		System.out.println("Message: " + getMessage);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiNgayHenTaiKhamNhoHonNgayKham(WebDriver driver) throws InterruptedException, IOException{
		Method.implicitlyWait(driver, 5);
		//		timKiemMaYTCN(driver, 14, 2);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		//		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKham(), ExcelUntil.getData(14, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtBSKham(), ExcelUntil.getData(14 , 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenKham(), ExcelUntil.getData(14 , 5));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuu());
        Thread.sleep(500);
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String message = ExcelUntil.getData(14, 6);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraMauKhungKhiBoTrongTruongBatBuoc(WebDriver driver) throws InterruptedException, IOException{
		//		Method.implicitlyWait(driver, 5);
		//		timKiemMaYTCN(driver, 15, 2);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKham(), ExcelUntil.getData(15, 3));
		Thread.sleep(500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnBoCSoKham());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtBSKham(), ExcelUntil.getData(15 , 4));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenKham());
		WebElement mauKhungNgayKham = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungNgayKham());
		String getMauKhungNgayKham = mauKhungNgayKham.getCssValue("border-bottom-color");
		WebElement mauKhungCSoKham = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungBoCSoKham());
		String getMauKhungCSoKham = mauKhungCSoKham.getCssValue("border-bottom-color");
		WebElement mauKhungBSKham = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungBSKham());
		String getMauKhungBSKham = mauKhungBSKham.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(15, 7);
		Assert.assertEquals(getMauKhungNgayKham, mau);
		Assert.assertEquals(getMauKhungCSoKham, mau);
		Assert.assertEquals(getMauKhungBSKham, mau);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongXoaLapHoSo());
	}

	public void kiemTraNutLuuKhongDuocClickKhiThieuTruongBatBuoc(WebDriver driver) {
		Boolean check = Method.elementEnable(driver, ObjectQLHSSucKhoeDeclare.btnLuu());
		Assert.assertFalse(check);
	}

	public void xoaLSTruocDo(WebDriver driver) {
		try {
			Boolean xoa;
			do {
				Thread.sleep(3000);
				xoa = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoa1ThemLS());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoa1ThemLS());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaOkThemLS());
			}while(xoa);
		} catch (Exception e) {
		}

		try {
			Boolean xoaNhieu2;
			do {
				Thread.sleep(3000);
				xoaNhieu2 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSNhieu2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSNhieu2());
				Thread.sleep(3000);
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongYXoa());
			}while(xoaNhieu2);
		} catch (Exception e) {
		}

		try {
			Boolean xoaMot;
			xoaMot = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
			if(xoaMot == true){
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
			}
		} catch (Exception e) {
		}
	}

	public void lapHSSucKhoeVoiThongTinHopLe(WebDriver driver) throws InterruptedException, IOException{
		timKiemMaYTCN(driver, 17, 2);
		Thread.sleep(500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		Thread.sleep(500);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKham(), ExcelUntil.getData(17, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtBSKham(), ExcelUntil.getData(17 , 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenKham(), ExcelUntil.getData(17 , 5));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuu());
		soSanhTaoHS(driver);
	}

	public void soSanhTaoHS(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(7000);
		timKiemMaYTCN(driver, 17, 2);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
		Method.implicitlyWait(driver, 3);
		xoaLSTruocDo(driver);
		String dotKCB = ExcelUntil.getData(17, 3) + " - " + ExcelUntil.getData(17, 3);
		String getDotKCB = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathDotKCBSS());

		Method.implicitlyWait(driver, 3);
		String bSKham = ExcelUntil.getData(17, 4);
		String getBSKham = Method.getText(driver  , ObjectQLHSSucKhoeDeclare.xpathSSBacSiKham());

		String ngayKham = "Ngày khám: " + ExcelUntil.getData(17, 3);
		Method.implicitlyWait(driver, 3);
		String getNgayKham = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathSSNgayKham());
		System.out.println(getNgayKham);

		String ngayHenKham = ExcelUntil.getData(17, 5);
		Method.implicitlyWait(driver, 3);
		String getNgayHenKham = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathSSNgayHenTaiKham());

		Assert.assertEquals(dotKCB, getDotKCB);
		Assert.assertEquals(bSKham, getBSKham);
		Assert.assertEquals(ngayKham, getNgayKham);
		Assert.assertEquals(ngayHenKham, getNgayHenKham);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnQLHSSucKhoe());
	}

	public void kiemTraNutXoaSauKhiDaLapHoSo(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		timKiemMaYTCN(driver, 18, 2);
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo()); 
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLapHoSo());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMHXoaLapHoSo());
		String message = ExcelUntil.getData(18, 8);
		Assert.assertEquals(getMessage, message);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongXoaLapHoSo());
	}

	public void kiemTraNutDongMHTaoLapHoSo(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongXoaLapHoSo());
		Thread.sleep(500);
		Boolean check = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnLapHoSo());
		Assert.assertTrue(check);
	}
}
