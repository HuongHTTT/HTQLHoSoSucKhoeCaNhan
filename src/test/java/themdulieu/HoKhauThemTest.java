package themdulieu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class HoKhauThemTest {
	WebDriver driver;
	  Login login = new Login();
	  HoKhauThem them = new HoKhauThem();
	  @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		  System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("http://10.60.110.21:8080/#/ho-khau");
		  login.LoginValid(driver);
		  ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet1");
	  }
	  
	  @Test(priority = 0)
	  public void them01() throws IOException, InterruptedException {
		  them.themHoKhau(driver);
	  }
	  
	  @Test(priority = 1)
	  public void them02() throws IOException, InterruptedException {
		  them.themNKVaoHK(driver);
	  }
	  
	  @AfterClass
		public void close(){
			driver.close();
		}
}
