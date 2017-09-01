package themdulieu;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import login.Login;

public class NhanKhauThemTest {
	 WebDriver driver;
	  Login login = new Login();
	  NhanKhauThem them = new NhanKhauThem();
	  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		  System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		  login.LoginValid(driver);
	  }
	  @Test(priority = 0)
	  public void them01() throws IOException, InterruptedException {
		  them.opendExcel(driver, "D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet1");
	  }
	  
//	  @AfterClass
//		public void close(){
//			driver.close();
//		}
}
