package quanlyhososuckhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class TiemChungNgoaiCTTest {
	WebDriver driver;
	Login login = new Login();
	TiemChungNgoaiCT them = new TiemChungNgoaiCT();
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		Thread.sleep(2000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet8");
	}

	@Test(priority = 0)
	public void kiemTraNutLuuKhongChoPhepKhiBoTrongTruongBatBuoc() throws IOException, InterruptedException {
		them.kiemTraNutLuuKhongChoPhepKhiBoTrongTruongBatBuoc(driver);
	}
	
	@Test(priority = 1)
	public void kiemTraThongBaoKhiNgayHenTiemNhoHonNgayChungNgua() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNgayHenTiemNhoHonNgayChungNgua(driver);
	}
	
	@Test(priority = 2)
	public void kiemTraMauKhiCacTruowngBatBuocKhongHopLe() throws IOException, InterruptedException {
		them.kiemTraMauKhiCacTruowngBatBuocKhongHopLe(driver);
	}
	
	@Test(priority = 3)
	public void themKhiNhapDayDuThongTin() throws IOException, InterruptedException {
		them.themKhiNhapDayDuThongTin(driver);
	}
	
	@Test(priority = 4)
	public void kiemTraThongBaoKhiNhapThongTinTruocDoDaCo() throws IOException, InterruptedException {
		them.kiemTraThongBaoKhiNhapThongTinTruocDoDaCo(driver);
	}
	
	@AfterClass
	public void close(){
		driver.close();
	}
}
