package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class NKThemVaoHK1Test {
	WebDriver driver;
	Login login = new Login();
	NKThemVaoHK1 them = new NKThemVaoHK1();

	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/ho-khau");
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet4");
	}
	
	@Test(priority = 0)
	public void kiemTraThongBaoKhiBoTrongThongTin() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiBoTrongThongTin(driver);
	}
	
	@Test(priority = 1)
	public void kiemTraThongBaoKhiBoTrongNhanKhau() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiBoTrongNhanKhau(driver);
	}
	
	@Test(priority = 2)
	public void kiemTraMauKhungKhiBoTrongQHVoiChuHo() throws IOException, InterruptedException {
        them.kiemTraMauKhungKhiBoTrongQHVoiChuHo(driver);
	}
	
	@Test(priority = 3)
	public void kiemTraThongBaoKhiKhongChonQHVoiChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiKhongChonQHVoiChuHo(driver);
	}
	
	//----------------------------------da xet------------------
	
	@Test(priority = 4)
	public void kiemTraThongBaoKhiNKDangLaChuHoCuaHoKhac() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiNKDangLaChuHoCuaHoKhac(driver);
	}
	
	@Test(priority = 5)
	public void themNKVaoHKKhiDangLaThanhVienCuaHoKhac() throws IOException, InterruptedException {
        them.themNKVaoHKKhiDangLaThanhVienCuaHoKhac(driver);
	}
	
	@Test(priority = 6)
	public void themNKVaoHKKhiChuaLaThanhVienCuaHoKhac() throws IOException, InterruptedException {
        them.themNKVaoHKKhiChuaLaThanhVienCuaHoKhac(driver);
	}
	
	@Test(priority = 7)
	public void kiemTraThongBaoKhiNKDaTonTaiTrongHK() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiNKDaTonTaiTrongHK(driver);
	}
	
	@Test(priority = 8)
	public void kiemTraKhiClickNutSuaNKDangLaChuHoKhongChoPhepSua() throws IOException, InterruptedException {
        them.kiemTraKhiClickNutSuaNKDangLaChuHoKhongChoPhepSua(driver);
	}
	
	@Test(priority = 9)
	public void kiemTraKhiClickNutXoaNKDangLaChuHoKhongChoPhepXoa() throws IOException, InterruptedException {
        them.kiemTraKhiClickNutXoaNKDangLaChuHoKhongChoPhepXoa(driver);
	}
	
	@Test(priority = 10)
	public void kiemTraThongBaoKhiClickNutSuaNKKhongLaChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiClickNutSuaNKKhongLaChuHo(driver);
	}
	
	@Test(priority = 11)
	public void kiemTraThongBaoKhiClickNutXoaNKKhongLaChuHo() throws IOException, InterruptedException {
        them.kiemTraThongBaoKhiClickNutXoaNKKhongLaChuHo(driver);
	}
	
	@Test(priority = 12)
	public void kiemTraThongBaoClickNutLuuKhiDuLieuKhongDoi() throws IOException, InterruptedException {
        them.kiemTraThongBaoClickNutLuuKhiDuLieuKhongDoi(driver);
	}
	
	@Test(priority = 13)
	public void kiemTraClickNutDongMHSuaSangMHQLyHK() throws IOException, InterruptedException {
        them.kiemTraClickNutDongMHSuaSangMHQLyHK(driver);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
