package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;
import quanlyhososuckhoe.HSSucKhoeTaoLap;

public class HSSucKhoeTaoLapTest {
	WebDriver driver;
	Login login = new Login();
	HSSucKhoeTaoLap them = new HSSucKhoeTaoLap();
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		Thread.sleep(500);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet6");
	}

	@Test(priority = 0)
	public void kiemTraThongBaoClickNutLuuKhiChuaThayDoiThongTin() throws IOException, InterruptedException {
		them.kiemTraThongBaoClickNutLuuKhiChuaThayDoiThongTin(driver);
	}
	
	@Test(priority = 1)
	public void kiemTraThongBaoKhiNgayKhamLonHonNgayHienTai() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayKhamLonHonNgayHienTai(driver);
	}
	
	@Test(priority = 2)
	public void kiemTraThongBaoKhiNgayHenTaiKhamNhoHonNgayKham() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayHenTaiKhamNhoHonNgayKham(driver);
	}
	
	@Test(priority = 3)
	public void kiemTraMauKhungKhiBoTrongTruongBatBuoc() throws IOException, InterruptedException {
		them.kiemTraMauKhungKhiBoTrongTruongBatBuoc(driver);
	}
	
	@Test(priority = 4)
	public void kiemTraNutLuuKhongDuocClickKhiThieuTruongBatBuoc() throws IOException, InterruptedException {
		them.kiemTraNutLuuKhongDuocClickKhiThieuTruongBatBuoc(driver);
	}
	
	@Test(priority = 5)
	public void lapHSSucKhoeVoiThongTinHopLe() throws IOException, InterruptedException {
		them.lapHSSucKhoeVoiThongTinHopLe(driver);
	}
	
	@Test(priority = 6)
	public void kiemTraNutXoaSauKhiDaLapHoSo() throws IOException, InterruptedException {
		them.kiemTraNutXoaSauKhiDaLapHoSo(driver);
	}
	
	@Test(priority = 7)
	public void kiemTraNutDongMHTaoLapHoSo() throws IOException, InterruptedException {
		them.kiemTraNutDongMHTaoLapHoSo(driver);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
