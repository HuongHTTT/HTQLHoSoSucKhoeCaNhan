package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHSSucKhoeDeclare;

public class LichSuKCB {
	public void timKiemMaYTCN(WebDriver driver, int rowNum,int columNum) {
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtMaYTCNSearch(), ExcelUntil.getData(rowNum, columNum));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnTimKiemSearch());
	}

	public void kiemTraClickNutLuuKhongChoPhepKhiThieuThongTinBatBuoc(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(500);
		timKiemMaYTCN(driver, 12, 2);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnThemLS());
		Boolean luu = Method.elementEnable(driver, ObjectQLHSSucKhoeDeclare.btnLuuThemLS());
		Assert.assertFalse(luu);
	}

	public void kiemTraMauKhungKhiNhapSaiThongTinBatBuoc(WebDriver driver) throws InterruptedException {
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKhamThemLS(), ExcelUntil.getData(13, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayBatDauThemLS(), ExcelUntil.getData(13, 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKetThucThemLS(), ExcelUntil.getData(13, 5));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTaiKhamThemLS());
		Thread.sleep(500);
		WebElement mauKhungNgayKham = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungNgayKhamThemLS());
		String getMauKhungNgayKham = mauKhungNgayKham.getCssValue("border-bottom-color");
		WebElement mauKhungBatDau = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungNgayBatDauThemLS());
		String getMauKhungNgayBatDau = mauKhungBatDau.getCssValue("border-bottom-color");

		WebElement mauKhungNgayKetThuc = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.xpathKhungNgayKetThucThemLS());
		String getMauKhungNgayKetThuc = mauKhungNgayKetThuc.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(13, 13);

		Assert.assertEquals(getMauKhungNgayKham, mau);
		Assert.assertEquals(getMauKhungNgayBatDau, mau);
		Assert.assertEquals(getMauKhungNgayKetThuc, mau);
	}

	public void kiemTraThongBaoKhiNgayKhamKhongĐungDinhDang(WebDriver driver) {
		String getNgayKham = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMessageNgayKhamThemLS());
		String ngayKham = ExcelUntil.getData(14, 12);
		Assert.assertEquals(getNgayKham, ngayKham);
	}

	public void kiemTraThongBaoKhiNgayBatDauKhongĐungDinhDang(WebDriver driver) {
		String getNgayBatDau = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMessageNgayBatDauThemLS());
		String ngayBatDau = ExcelUntil.getData(15, 12);
		Assert.assertEquals(getNgayBatDau, ngayBatDau);
	}

	public void kiemTraThongBaoKhiNgayKetThucKhongĐungDinhDang(WebDriver driver) {
		String getNgayKetThuc = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMessageNgayKetThucThemLS());
		String ngayKetThuc = ExcelUntil.getData(16, 12);
		Assert.assertEquals(getNgayKetThuc, ngayKetThuc);
	}

	public void themKhiNgayKhamNhoHonNgayBatDau(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 13, 2);
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnLichSuKham());
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnThemLS());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKhamThemLS(), ExcelUntil.getData(17, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayBatDauThemLS(),ExcelUntil.getData(17, 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKetThucThemLS(), ExcelUntil.getData(17, 5));
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuThemLS());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessageThemLS());
		String message = ExcelUntil.getData(17, 12);
		Assert.assertEquals(message, getMessage);
	}

	public void themKhiNgayBatDaulonHonNgayKetThuc(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 14, 2);
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnLichSuKham());
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnThemLS());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKhamThemLS(), ExcelUntil.getData(18, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayBatDauThemLS(),ExcelUntil.getData(18, 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKetThucThemLS(), ExcelUntil.getData(18, 5));
		Thread.sleep(5500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuThemLS());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessageThemLS());
		String message = ExcelUntil.getData(18, 12);;
		Assert.assertEquals(message, getMessage);
	}

	public void themKhiNgayTaiKhamNhoHonNgayKham(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 15, 2);
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnLichSuKham());
		//		Method.click(driver, DeclareObjectQLHSSucKhoe.btnThemLS());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKhamThemLS(), ExcelUntil.getData(19, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayBatDauThemLS(),ExcelUntil.getData(19, 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKetThucThemLS(), ExcelUntil.getData(19, 5));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTaiKhamThemLS(), ExcelUntil.getData(19, 6));
		Thread.sleep(5500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuThemLS());
		String getMessage = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessageThemLS());
		String message = ExcelUntil.getData(19, 12);;
		Assert.assertEquals(message, getMessage);
		Thread.sleep(6000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongThemLS());
	}

	public void xoaDuLieuThemLS(WebDriver driver) throws InterruptedException {
		try {
			Boolean xoa;
			do {
				Thread.sleep(2000);
				xoa = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoa1ThemLS());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoa1ThemLS());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaOkThemLS());
			}while(xoa);
		} catch (Exception e) {
		}

		try {
			Boolean xoaNhieu2;
			do {
				Thread.sleep(2000);
				xoaNhieu2 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSNhieu2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSNhieu2());
				Thread.sleep(2000);
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongYXoa());
			}while(xoaNhieu2);
		} catch (Exception e) {
		}

		try {
			Boolean xoaMot = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
			if(xoaMot == true){
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSMot());
			}
		} catch (Exception e) {
		}
	}



	public void themVoiDieuKienHopLe(WebDriver driver) throws InterruptedException, IOException{
		//		Thread.sleep(500);
		//				timKiemMaYTCN(driver, 20, 2);
		//				Thread.sleep(2000);
		//				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());

		xoaDuLieuThemLS(driver);
		Thread.sleep(3000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnThemLS());
		Method.implicitlyWait(driver, 2);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKhamThemLS(), ExcelUntil.getData(20, 3));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayBatDauThemLS(),ExcelUntil.getData(20, 4));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayKetThucThemLS(), ExcelUntil.getData(20, 5));
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.dropNoiKhamThemLS());
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.xpathNoiKhamThemLS());
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtNgayHenTaiKhamThemLS(), ExcelUntil.getData(20, 6));
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtBSKhamThemLS(), ExcelUntil.getData(20, 11));
		Thread.sleep(3000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLuuThemLS());
		soSanhlichSuKCBenh(driver);
	}

	public void soSanhlichSuKCBenh(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(500);
		String dotKCB = ExcelUntil.getData(20, 4) + " - " + ExcelUntil.getData(20, 5);
		Method.implicitlyWait(driver, 5);
		String getDotKCB = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathDotKCBSSThemLS());

		String bacSiKCB = ExcelUntil.getData(20, 11);
		Thread.sleep(1000);
		String getBacSiKCB = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathBacSiSSThemLS());

		String ngayKham = "Ngày khám: " + ExcelUntil.getData(20, 3);
		Method.implicitlyWait(driver, 5);
		String getNgayKham = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathSSNgayKham());

		String ngayHenKham = ExcelUntil.getData(20, 6);
		Method.implicitlyWait(driver, 5);
		String getNgayHenKham = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathSSNgayHenTaiKham());

		Assert.assertEquals(dotKCB, getDotKCB);
		Assert.assertEquals(bacSiKCB, getBacSiKCB);
		Assert.assertEquals(ngayKham, getNgayKham);
		Assert.assertEquals(ngayHenKham, getNgayHenKham);
	}

	public void kiemTraClickNutSuaSangMHCapNhatThongTinKCB(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 21, 2);
		//		Thread.sleep(500);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnSuaThongTinThemLS());
		String getTenMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMHSuaThongTinThemLS());
		String tenMH = ExcelUntil.getData(21, 14);
		Assert.assertEquals(getTenMH, tenMH);
	}

	public void xoaDLSuaCanLamSang(WebDriver driver) {
		try {
			Boolean xoa1, xoa2;
			do {
				xoa1 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS1());
				xoa2 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS2());
			}while(xoa2);
		} catch (Exception e) {
		}
	}

	public void kiemTraThongBaoKhiNhapTenDichVuKhongNhapKetQuaMHCapNhatThongTinKCB(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 21, 2);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
		//		Thread.sleep(500);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnSuaThongTinThemLS());
		xoaDLSuaCanLamSang(driver);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenDichVuThemLS(), ExcelUntil.getData(22, 7)); 
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS());
		String getTenMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String tenMH = ExcelUntil.getData(22, 12);
		Assert.assertEquals(getTenMH, tenMH);
	}

	public void kiemTraThongBaoKhiNhapKetQuaKhongNhapTenDichVuMHCapNhatThongTinKCB(WebDriver driver) throws InterruptedException, IOException{
		//		timKiemMaYTCN(driver, 21, 2);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
		//		Thread.sleep(500);
		//		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnSuaThongTinThemLS());
		Thread.sleep(6000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenDichVuThemLS(), ExcelUntil.getData(23, 7)); 
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtKetQuaThemLS(), ExcelUntil.getData(23, 8)); 
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS());
		String getTenMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String tenMH = ExcelUntil.getData(23, 12);
		Assert.assertEquals(tenMH, getTenMH);
	}

	public void kiemTraTaoDongMoiKhiNhapDayDuTenDichVuVaKetQua(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenDichVuThemLS(), ExcelUntil.getData(24, 7)); 
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS());
		Boolean check = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckCanLamSangThemLS2());
		Assert.assertTrue(check);
	}

	public void xoaDLSuaDonThuoc(WebDriver driver) {
		try {
			Boolean xoa1, xoa2;
			do {
				Thread.sleep(2000);
				xoa1 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS1());
				xoa2 = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS2());
				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS2());
			}while(xoa2);
		} catch (Exception e) {
		}
	}
	public void kiemTraThongBaoKhiNhapTenThuocKhongNhapSoLuongMHCapNhatThongTinKCB(WebDriver driver) throws InterruptedException, IOException{
//				timKiemMaYTCN(driver, 21, 2);
//				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
//				Thread.sleep(500);
//				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnSuaThongTinThemLS());
		Method.implicitlyWait(driver, 5);
		xoaDLSuaDonThuoc(driver);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenThuocThemLS(), ExcelUntil.getData(25, 9)); 
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS());
		String getTenMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String tenMH = ExcelUntil.getData(25, 12);
		Assert.assertEquals(tenMH, getTenMH);
	}

	public void kiemTraThongBaoKhiNhapSoLuongKiTuKhacSo(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenThuocThemLS(), ExcelUntil.getData(26, 9)); 
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtSoLuongThemLS(), ExcelUntil.getData(26, 10)); 
		String getText = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMessageSoLuong());
		String text = ExcelUntil.getData(26, 12);
		Assert.assertEquals(getText, text);
	}

	public void kiemTraThongBaoKhiNhapSoLuongKhongNhapTenThuocgMHCapNhatThongTinKCB(WebDriver driver) throws InterruptedException, IOException{
//				timKiemMaYTCN(driver, 21, 2);
//				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnLichSuKham());
//				Thread.sleep(500);
//				Method.click(driver, ObjectQLHSSucKhoeDeclare.btnSuaThongTinThemLS());
		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtSoLuongThemLS(), ExcelUntil.getData(27, 10)); 
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS());
		String getTenMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathmessage());
		String tenMH = ExcelUntil.getData(27, 12);
		Assert.assertEquals(tenMH, getTenMH);
	}

	public void kiemTraTaoDongMoiKhiNhapDayDuTenThuocVaSoLuong(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtTenThuocThemLS(), ExcelUntil.getData(28, 9)); 
		Thread.sleep(5000);
		WebElement soLuong = Method.findElement(driver, ObjectQLHSSucKhoeDeclare.txtSoLuongThemLS());
		soLuong.sendKeys("12345");
		soLuong.clear();
		Method.clear(driver, ObjectQLHSSucKhoeDeclare.txtSoLuongThemLS());
//		Actions action = new Actions(driver);
//		action.moveToElement(soLuong).keyDown(soLuong, Keys.BACK_SPACE).sendKeys("        ").build().perform();
		Thread.sleep(5000);
		Method.senKey(driver, ObjectQLHSSucKhoeDeclare.txtSoLuongThemLS(), ExcelUntil.getData(28, 10)); 

		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS());
		Boolean check = Method.elementDisplay(driver, ObjectQLHSSucKhoeDeclare.btnCheckDonThuocThemLS2());
		Assert.assertTrue(check);
	}
	
	public void kiemTraClickNutXoaThongTinKhamChuaBenhSangMHXacNhanHanhDongXoa(WebDriver driver) throws InterruptedException {
		Thread.sleep(6000);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongThemLS());
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnXoaLSNhieu1());
		String getTextMH = Method.getText(driver, ObjectQLHSSucKhoeDeclare.xpathMHXoaThemLS());
		String Text = ExcelUntil.getData(29, 14);
		Assert.assertEquals(getTextMH, Text);
		Thread.sleep(500);
		Method.click(driver, ObjectQLHSSucKhoeDeclare.btnDongXacNhanXoaThemLS());
	}
}
