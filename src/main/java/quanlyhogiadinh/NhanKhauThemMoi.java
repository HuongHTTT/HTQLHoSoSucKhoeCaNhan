package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLNhanKhauDeclare;

public class NhanKhauThemMoi {
	public void chonDiaChi(WebDriver driver) {
		Method.click(driver, ObjectQLNhanKhauDeclare.dropTinhKhaiSinh());
		Method.click(driver, ObjectQLNhanKhauDeclare.xpathCanTho());
//		Method.click(driver, ObjectQLNhanKhauDeclare.dropTinhThanhPho());
//		Method.click(driver, ObjectQLNhanKhauDeclare.xpathHaNoi());
//		Method.click(driver, ObjectQLNhanKhauDeclare.dropHuyen()); 
//		Method.click(driver, ObjectQLNhanKhauDeclare.xpathHuyen());
//		Method.click(driver, ObjectQLNhanKhauDeclare.dropPhuongXa());
//		Method.click(driver, ObjectQLNhanKhauDeclare.xpathPhuongXa());
	}

	public void themKhiNhapThieuThongTinBatBuoc(WebDriver driver) throws IOException, InterruptedException {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Method.implicitlyWait(driver, 2);

		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(9, 2));
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.btnTiepTuc());
		Boolean check = ele.isEnabled();
		Assert.assertFalse(check, "False themKhiNhapThieuThongTinBatBuoc");
	}

	public void kiemTraMauKhiSaiTruongBatBuoc(WebDriver driver) throws InterruptedException {
		//		Thread.sleep(100);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(10, 2));
		Method.findElement(driver, ObjectQLNhanKhauDeclare.txtHoTen()).clear();
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(10, 3));

		Method.implicitlyWait(driver, 5);
		WebElement tinhKhaiSinh = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnXoaTinhKhaiSinh());
		WebElement phuongXa = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnXoaPhuongXa());
		WebElement quanHuyen = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnXoaHuyen());
		WebElement tinhTP = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnXoaTinhThanhPho());

		Actions action = new Actions(driver);
		action.moveToElement(tinhKhaiSinh).click(tinhKhaiSinh).moveToElement(phuongXa).click(phuongXa)
		.moveToElement(quanHuyen).click(quanHuyen).moveToElement(tinhTP).click(tinhTP).build().perform();

		WebElement khungHoTen = Method.findElement(driver, ObjectQLNhanKhauDeclare.khungHoTen());
		String mauHoTen = khungHoTen.getCssValue("border-bottom-color");
		WebElement khungNgaySinh = Method.findElement(driver, ObjectQLNhanKhauDeclare.khungNgaySinh());
		String mauNgaySinh = khungNgaySinh.getCssValue("border-bottom-color");

		WebElement khungTinhKhaiSinh = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungTinhKhaiSinh());
		String mauKhungTinhKhaiSinh = khungTinhKhaiSinh.getCssValue("border-bottom-color");

		WebElement khungPhuongXa = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungPhuongXa());
		String mauKhungPhuongXa = khungPhuongXa.getCssValue("border-bottom-color");

		WebElement khungQuanHuyen = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungHuyen());
		String mauKhungQuanHuyen = khungQuanHuyen.getCssValue("border-bottom-color");

		WebElement khungTinhTP = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungTinhThanhPho());
		String mauKhungTinhTP = khungTinhTP.getCssValue("border-bottom-color");

		String mau = ExcelUntil.getData(10, 15);
		Assert.assertEquals(mau, mauHoTen);
		Assert.assertEquals(mau, mauNgaySinh);
		Assert.assertEquals(mau, mauKhungTinhKhaiSinh);
		Assert.assertEquals(mau, mauKhungPhuongXa);
		Assert.assertEquals(mau, mauKhungQuanHuyen);
		Assert.assertEquals(mau, mauKhungTinhTP);
	}

	public void kiemTraMauKhiSaiTruongKhongBatBuoc(WebDriver driver) throws InterruptedException {
		//		Thread.sleep(1000);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Method.implicitlyWait(driver, 5);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoCMND(), ExcelUntil.getData(11, 4));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoTheBHYT(), ExcelUntil.getData(11, 5));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoDienThoai(), ExcelUntil.getData(11, 6));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoDienThoaiNgGiamHo(), ExcelUntil.getData(11, 7));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoCMNDNgGiamHo(), ExcelUntil.getData(11, 8));
		Method.click(driver, ObjectQLNhanKhauDeclare.txtHoTen());

		Method.implicitlyWait(driver, 5);
		WebElement khungSoCMND = Method.findElement(driver, ObjectQLNhanKhauDeclare.txtSoCMND());
		String mauKhungSoCMND = khungSoCMND.getCssValue("border-bottom-color");
		WebElement khungSoTheBHYT = Method.findElement(driver, ObjectQLNhanKhauDeclare.txtSoTheBHYT());
		String mauKhungSoTheBHYT = khungSoTheBHYT.getCssValue("border-bottom-color");
		WebElement khungSoDienThoai = Method.findElement(driver, ObjectQLNhanKhauDeclare.txtSoDienThoai());
		String mauKhungSoDienThoai = khungSoDienThoai.getCssValue("border-bottom-color");
		WebElement khungSoDienThoaiNgGiamHo = Method.findElement(driver,ObjectQLNhanKhauDeclare.txtSoDienThoaiNgGiamHo());
		String mauKhungSoDienThoaiNgGiamHo = khungSoDienThoaiNgGiamHo.getCssValue("border-bottom-color");
		WebElement khungSoCMNDNgGiamHo = Method.findElement(driver, ObjectQLNhanKhauDeclare.txtSoCMNDNgGiamHo());
		String mauKhungSoCMNDNgGiamHo = khungSoCMNDNgGiamHo.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(11, 15);

		Assert.assertEquals(mau, mauKhungSoCMND);
		Assert.assertEquals(mau, mauKhungSoTheBHYT);
		Assert.assertEquals(mau, mauKhungSoDienThoai);
		Assert.assertEquals(mau, mauKhungSoDienThoaiNgGiamHo);
		Assert.assertEquals(mau, mauKhungSoCMNDNgGiamHo);
	}

	public void kiemTraChucNangNutDongOBuoc1(WebDriver driver) throws InterruptedException {
		//		Thread.sleep(1000);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongB1());
		Method.implicitlyWait(driver, 5);

		Boolean nutThemMoi = Method.elementDisplay(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Assert.assertTrue(nutThemMoi);
	}

	public void kiemTraThongBaoNhapNgSinhNhoHon1900(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Thread.sleep(1000);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(13, 2));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(13, 3));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Method.implicitlyWait(driver, 5);
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathmessage1());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(13, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoNhapNgSinhLonHonHienTai(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(14, 2));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(14, 3));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Method.implicitlyWait(driver, 5);
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathmessage1());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(14, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraNgaySinhBang1900DuocChapNhan(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(15, 2));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(15, 3));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(3000);
		WebElement so2 = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathSo2());
		Thread.sleep(3000);
		String mauSo2 = so2.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(15, 15);
		Assert.assertEquals(mau, mauSo2);
	}

	public void kiemTraThongBaoTreEmDuoi1TuoiKhongCoNgGiamHo(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(16, 2));
		//----------------------dung khi chay theo luong-------------------------
		Method.click(driver, ObjectQLNhanKhauDeclare.btnBuoc1());
		//----------------------------------------------------------------------
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(16, 3));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(500);
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathmessage1());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(16, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoTreEmDuoi1TuoiKhongNhapQHVoiNgGiamHo(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(16, 2));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(16, 3));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHTenNguoiGiamHo(), ExcelUntil.getData(17, 7));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(500);
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathmessage1());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(17, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiBoTrongTruongDanToc(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(18, 2));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(18, 3));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHTenNguoiGiamHo(), ExcelUntil.getData(18, 7));
		Method.click(driver, ObjectQLNhanKhauDeclare.dropMoiQHNgGiamHo());
		Method.click(driver, ObjectQLNhanKhauDeclare.xpathMoiQHNgGiamHo());
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(7000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnBoDanToc());
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathMessageDanToc());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(18, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiBoTrongTruongQuocTich(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(19, 2));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(19, 3));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHTenNguoiGiamHo(), ExcelUntil.getData(19, 7));
		//		Method.click(driver, ObjectQLNhanKhauDeclare.dropMoiQHNgGiamHo());
		//		Method.click(driver, ObjectQLNhanKhauDeclare.xpathMoiQHNgGiamHo());
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		//		Thread.sleep(7000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnBoQuocTich());
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathMessageQuocTich());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(19, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiBoTrongTruongTonGiao(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		//		Thread.sleep(500);
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(20, 2));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(20, 3));
		//		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHTenNguoiGiamHo(), ExcelUntil.getData(20, 7));
		//		Method.click(driver, ObjectQLNhanKhauDeclare.dropMoiQHNgGiamHo());
		//		Method.click(driver, ObjectQLNhanKhauDeclare.xpathMoiQHNgGiamHo());
		//		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		//		Thread.sleep(7000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnBoTonGiao());
		WebElement ele = driver.findElement(ObjectQLNhanKhauDeclare.xpathMessageTonGiao());
		String getMessage = ele.getText();
		String message = ExcelUntil.getData(20, 14);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraMauKhungBoTrongDanTocQuocTichTonGiao(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		WebElement danToc = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungDanToc());
		String khungDanToc = danToc.getCssValue("border-bottom-color");

		WebElement quocTich = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungQuocTich());
		String khungQuocTich = quocTich.getCssValue("border-bottom-color");

		WebElement tonGiao = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathKhungTonGiao());
		String khungTonGiao = tonGiao.getCssValue("border-bottom-color");
		String mau = ExcelUntil.getData(21, 15);

		Assert.assertEquals(mau, khungDanToc);
		Assert.assertEquals(mau, khungQuocTich);
		Assert.assertEquals(mau, khungTonGiao);
	}

	public void kiemTraNutLuuMH2KhiNhapThieuThongTin(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);

		WebElement btnLuuHoSo = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnLuuHoSo());
		Boolean check = btnLuuHoSo.isEnabled();
		Assert.assertFalse(check);
	}

	public void kiemTraChucNangNutQuayLaiMH2(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnQuayLaiB2());
		Thread.sleep(1000);
		WebElement btnTiepTuc = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Boolean check = btnTiepTuc.isDisplayed();
		Assert.assertTrue(check);
	}

	public void kiemTraChucNangNutDongMH2(WebDriver driver) throws InterruptedException {
		Method.implicitlyWait(driver, 5);
		chonDiaChi(driver);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(7000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongMH2());
		Thread.sleep(1000);
		WebElement btnThemMoi = Method.findElement(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Boolean check = btnThemMoi.isDisplayed();
		Assert.assertTrue(check);
	}

	public void kiemTraNutLuuMH2KhiNhapDayDuDuLieu(WebDriver driver) throws InterruptedException, IOException {
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnThemMoi());
		Thread.sleep(500);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTen(), ExcelUntil.getData(18, 2));
		Method.click(driver, ObjectQLNhanKhauDeclare.radioButtonGioiTinhNu());
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtNgaySinh(), ExcelUntil.getData(18, 3));
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHTenNguoiGiamHo(), ExcelUntil.getData(18, 7));
		Method.click(driver, ObjectQLNhanKhauDeclare.dropMoiQHNgGiamHo());
		Method.click(driver, ObjectQLNhanKhauDeclare.xpathMoiQHNgGiamHo());
		Thread.sleep(500);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTiepTuc());
		Thread.sleep(7000);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtDiaChiHienTai(),ExcelUntil.getData(25, 10));
		Thread.sleep(2000);
		WebElement thon = Method.findElement(driver, ObjectQLNhanKhauDeclare.dropBoxThonXom());
		Boolean check = thon.isDisplayed();
		if(check){
			thon.click();
		}
		Method.implicitlyWait(driver, 5);
		WebElement thon1 = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathThonXom());
		Boolean check1 = thon1.isDisplayed();
		if(check1){
			thon1.click();
		}
		Thread.sleep(2000);
		Method.click(driver, ObjectQLNhanKhauDeclare.checkBoxDiaChi());
		Thread.sleep(2000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnLuuHoSo());
		soSanh(driver);
	}

	public void soSanh(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(8000);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtHoTenSearch(), ExcelUntil.getData(25, 2));
		Method.senKeyNotClear(driver, ObjectQLNhanKhauDeclare.dropGioiTinhSearch(),"NN");
		Method.senKey(driver, ObjectQLNhanKhauDeclare.dropNgSinhSearch(), ExcelUntil.getData(25, 3));
		Method.implicitlyWait(driver, 10);
		WebElement thon = Method.findElement(driver, ObjectQLNhanKhauDeclare.dropThonXomSearch());
		Boolean check = thon.isDisplayed();
		if(check){
			thon.click();
		}
		Method.click(driver, ObjectQLNhanKhauDeclare.xpathThonXomSearch());
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtSoNhaSearch(), ExcelUntil.getData(25, 10));
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTimKiemSearch());

		String getHoTen = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathSSHoTen());
		String hoTen = ExcelUntil.getData(25, 2);

		String getGioiTinh = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathSSGioiTinh());
		String gioiTinh = ExcelUntil.getData(25, 11);


		String getNgSinh = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathSSNgaySinh());
		String ngSinh = ExcelUntil.getData(25, 3);


		String getDiaChi = Method.getText(driver, ObjectQLNhanKhauDeclare.xpathSSDiaChi());
		String diaChi = ExcelUntil.getData(25, 12);

		Assert.assertEquals(getHoTen, hoTen);
		Assert.assertEquals(getGioiTinh, gioiTinh);
		Assert.assertEquals(getNgSinh, ngSinh);
		Assert.assertEquals(getDiaChi, diaChi);
	}

	public void kiemTraChucNangNutXemThongTinNK(WebDriver driver) throws InterruptedException {
		Method.click(driver, ObjectQLNhanKhauDeclare.btnXemThongTinNK());
		WebElement element = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathThongTinNK());
		String getText = element.getText();
		String text = ExcelUntil.getData(26, 16);

		Assert.assertEquals(getText, text);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongThongTinNK());
	}
	
	public void kiemTraClickNutSuaThongTinNhanKhauSangMHThemMoiHoacSuaThongTinCaNhan(WebDriver driver) {
		Method.click(driver, ObjectQLNhanKhauDeclare.btnSua());
		WebElement element = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathMHSua());
		String getMessage = element.getText();
		String message = ExcelUntil.getData(27, 16);
		Assert.assertEquals(message, getMessage);
	}

	public void kiemTraThongBaoKhiNhapThongTinBoMeLaChinhNhanKhauDangXet(WebDriver driver) throws InterruptedException {
//		Method.click(driver, ObjectQLNhanKhauDeclare.btnSua());
		Method.click(driver, ObjectQLNhanKhauDeclare.btnMaYTCNBo());
		Thread.sleep(1000);
		Method.senKey(driver, ObjectQLNhanKhauDeclare.txtMaYTCNBoSearch(), ExcelUntil.getData(28, 13));
		Method.senKeyNotClear(driver, ObjectQLNhanKhauDeclare.đropGioiTinhMaYTCNBoSearch(), "N");
		Method.click(driver, ObjectQLNhanKhauDeclare.btnTimKiemMaYTCNBoSearch());
		Thread.sleep(500);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnThaoTacMaYTCNBoSearch());
		WebElement element = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathMessageMaYTCNBo());
		String getMessage = element.getText();
		String message = ExcelUntil.getData(28, 14);
		Assert.assertEquals(message, getMessage);
		Thread.sleep(3000);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongMHSua());
	}
	
	public void kiemTraClickNutXoaThongTinNhanKhauSangMHXacNhanHanhDongXoa(WebDriver driver) {
		Method.click(driver, ObjectQLNhanKhauDeclare.btnXoaNK());
		WebElement element = Method.findElement(driver, ObjectQLNhanKhauDeclare.xpathMHXoaNK());
		String getMessage = element.getText();
		String message = ExcelUntil.getData(29, 16);
		Assert.assertEquals(message, getMessage);
		Method.click(driver, ObjectQLNhanKhauDeclare.btnDongMHXoaNK());
	}
}
