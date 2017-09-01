package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;

import themdulieu.NhanKhauThem;

public class LoginTest {
	WebDriver driver;
	Login login = new Login();

	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/login");
		Thread.sleep(2000);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet0");
	}

	@Test(priority = 0)
	public void boTrongTK() {
		login.boTrongTK(driver);
	}

	@Test(priority = 1)
	public void boTrongMK() {
		login.boTrongMK(driver);
	}

	@Test(priority = 2)
	public void boTrongTenDN() {
		login.boTrongTenDN(driver);
	}

	@Test(priority = 3)
	public void nhapSaiMK() throws InterruptedException {
		login.nhapSaiMK(driver);
	}
	
	@Test(priority = 4)
	public void nhapdungTK() throws InterruptedException {
		login.nhapdungTK(driver);
	}
}
