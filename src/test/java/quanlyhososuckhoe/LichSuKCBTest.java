package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class LichSuKCBTest {
	WebDriver driver;
	Login login = new Login();
	LichSuKCB them = new LichSuKCB();
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		Thread.sleep(2000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet7");
	}

	@Test(priority = 0)
	public void kiemTraClickNutLuuKhongChoPhepKhiThieuThongTinBatBuoc() throws IOException, InterruptedException {
		them.kiemTraClickNutLuuKhongChoPhepKhiThieuThongTinBatBuoc(driver);
	}
	
	@Test(priority = 1)
	public void kiemTraMauKhungKhiNhapSaiThongTinBatBuoc() throws IOException, InterruptedException {
		them.kiemTraMauKhungKhiNhapSaiThongTinBatBuoc(driver);
	}
	
	@Test(priority = 2)
	public void kiemTraThongBaoKhiNgayKhamKhongĐungDinhDang() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayKhamKhongĐungDinhDang(driver);
	}
	
	@Test(priority = 3)
	public void kiemTraThongBaoKhiNgayBatDauKhongĐungDinhDang() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayBatDauKhongĐungDinhDang(driver);
	}
	
	@Test(priority = 4)
	public void kiemTraThongBaoKhiNgayKetThucKhongĐungDinhDang() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayKetThucKhongĐungDinhDang(driver);
	}
	
	@Test(priority = 5)
	public void themKhiNgayKhamNhoHonNgayBatDau() throws IOException, InterruptedException {
		them.themKhiNgayKhamNhoHonNgayBatDau(driver);
	}
	
	@Test(priority = 6)
	public void themKhiNgayBatDaulonHonNgayKetThuc() throws IOException, InterruptedException {
		them.themKhiNgayBatDaulonHonNgayKetThuc(driver);
	}
	
	@Test(priority = 7)
	public void themKhiNgayTaiKhamNhoHonNgayKham() throws IOException, InterruptedException {
		them.themKhiNgayTaiKhamNhoHonNgayKham(driver);
	}
	
	@Test(priority = 8)
	public void themVoiDieuKienHopLe() throws IOException, InterruptedException {
		them.themVoiDieuKienHopLe(driver);
	}
	
	@Test(priority = 9)
	public void kiemTraClickNutSuaSangMHCapNhatThongTinKCB() throws IOException, InterruptedException {
		them.kiemTraClickNutSuaSangMHCapNhatThongTinKCB(driver);
	}
	
	@Test(priority = 10)
	public void kiemTraThongBaoKhiNhapTenDichVuKhongNhapKetQuaMHCapNhatThongTinKCB() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapTenDichVuKhongNhapKetQuaMHCapNhatThongTinKCB(driver);
	}
	
	@Test(priority = 11)
	public void kiemTraThongBaoKhiNhapKetQuaKhongNhapTenDichVuMHCapNhatThongTinKCB() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapKetQuaKhongNhapTenDichVuMHCapNhatThongTinKCB(driver);
	}
	
	@Test(priority = 12)
	public void kiemTraTaoDongMoiKhiNhapDayDuTenDichVuVaKetQua() throws IOException, InterruptedException {
		them.kiemTraTaoDongMoiKhiNhapDayDuTenDichVuVaKetQua(driver);
	}
	
	@Test(priority = 13)
	public void kiemTraThongBaoKhiNhapTenThuocKhongNhapSoLuongMHCapNhatThongTinKCB() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapTenThuocKhongNhapSoLuongMHCapNhatThongTinKCB(driver);
	}
	
	@Test(priority = 14)
	public void kiemTraThongBaoKhiNhapSoLuongKiTuKhacSo() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapSoLuongKiTuKhacSo(driver);
	}
	
	@Test(priority = 15)
	public void kiemTraThongBaoKhiNhapSoLuongKhongNhapTenThuocgMHCapNhatThongTinKCB() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapSoLuongKhongNhapTenThuocgMHCapNhatThongTinKCB(driver);
	}
	
	@Test(priority = 16)
	public void kiemTraClickNutXoaThongTinKhamChuaBenhSangMHXacNhanHanhDongXoa() throws IOException, InterruptedException {
		them.kiemTraClickNutXoaThongTinKhamChuaBenhSangMHXacNhanHanhDongXoa(driver);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
