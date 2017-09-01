package quanlyhogiadinh;

import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class HoKhauThemMoiTest { 
	WebDriver driver;
	Login login = new Login();
	HoKhauThemMoi them = new HoKhauThemMoi();

	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/ho-khau");
		Thread.sleep(500);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet3");
	}
	
	@Test(priority = 0)
	public void kiemTraChucNangNutDong() throws IOException, InterruptedException {
        them.kiemTraChucNangNutDong(driver);
	}
	
	@Test(priority = 1)
	public void kiemTraNutTaoMoiHoKhauKhongChoClick() throws IOException, InterruptedException {
        them.kiemTraNutTaoMoiHoKhauKhongChoClick(driver);
	}
	
	@Test(priority = 2)
	public void kiemTraThongBaoKhiClickNutLuuKhiChuaChonChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiClickNutLuuKhiChuaChonChuHo(driver);
	}
	
	@Test(priority = 3)
	public void kiemTraThongBaoKhiChonNKLaChuHoCuaHoKhac() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiChonNKLaChuHoCuaHoKhac(driver);
	}
	
	@Test(priority = 4)
	public void kiemTraThongBaoKhiChonNKDangCoQHVoiHoKhacLamChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiChonNKDangCoQHVoiHoKhacLamChuHo(driver);
	}
	
	@Test(priority = 5)
	public void kiemTraThongBaoKhiBoTrongDiaChiCuaChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiBoTrongDiaChiCuaChuHo(driver);
	}
	
	@Test(priority = 6)
	public void themHKVoiNKChuaLamChuHo() throws IOException, InterruptedException {
        them.themHKVoiNKChuaLamChuHo (driver);
	}
	
	@Test(priority = 7)
	public void kiemTraClickNutTaoMoiHoKhauSangMHThemMoiHoKhau() throws IOException, InterruptedException {
        them.kiemTraClickNutTaoMoiHoKhauSangMHThemMoiHoKhau (driver);
	}
	
	@Test(priority = 8)
	public void KiemTraClickNutXemChiTietVaoManHinhXemChiTiet() throws IOException, InterruptedException {
        them.KiemTraClickNutXemChiTietVaoManHinhXemChiTiet (driver);
	}
	
	@Test(priority = 9)
	public void KiemTraThongBaoKhiClickNutXoaHoKhau() throws IOException, InterruptedException {
        them.KiemTraThongBaoKhiClickNutXoaHoKhau (driver);
	}
	
	@Test(priority = 10)
	public void KiemTraClickNutSuaHoKhauVaoMHSuaHoKhau() throws IOException, InterruptedException {
        them.KiemTraClickNutSuaHoKhauVaoMHSuaHoKhau (driver);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
