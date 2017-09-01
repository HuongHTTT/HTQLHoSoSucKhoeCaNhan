package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class NKThemVaoHK2Test {
	WebDriver driver;
	  Login login = new Login();
	  NKThemVaoHK2 them = new NKThemVaoHK2();
	  @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		  System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		  Thread.sleep(2000);
		  login.LoginValid(driver);
		  ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet5");
	  }
	  
	  @Test(priority = 0)
	  public void kiemTraNutChonHoKhauKhongCHoCLickKhiNKDangLaChuHo() throws IOException, InterruptedException {
		  them.kiemTraNutChonHoKhauKhongCHoCLickKhiNKDangLaChuHo(driver);
	  }
	  
	  @Test(priority = 1)
	  public void kiemTraThongBaoKhiChuaChonQHVoiChuHo() throws IOException, InterruptedException {
		  them.kiemTraThongBaoKhiChuaChonQHVoiChuHo(driver);
	  }
	  
	  @Test(priority = 2)
	  public void themNKvaoHKKhiNKKhongLaChuHo() throws IOException, InterruptedException {
		  them.themNKvaoHKKhiNKKhongLaChuHo(driver);
	  }

	  @AfterClass
		public void close(){
			driver.close();
		}
	  
}
