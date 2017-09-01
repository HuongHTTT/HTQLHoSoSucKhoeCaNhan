package quanlyhogiadinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genneral.ExcelUntil;
import login.Login;

public class NhanKhauThemMoiTest {
	WebDriver driver;
	  Login login = new Login();
	  NhanKhauThemMoi them = new NhanKhauThemMoi();
	  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException, IOException {
		  System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		  login.LoginValid(driver);
		  ExcelUntil.readExcel("D:\\Dev\\DemoJava\\HeThongHoSoQuanLySucKhoeCaNhan\\Excel\\Data1.xlsx", "Sheet2");
	  }
	  
	  @Test(priority = 0)
	  public void themKhiNhapThieuThongTinBatBuoc() throws IOException, InterruptedException {
		 them.themKhiNhapThieuThongTinBatBuoc(driver);
	  }
	  
	  @Test(priority = 1)
	  public void kiemTraMauKhiSaiTruongBatBuoc() throws IOException, InterruptedException {
		 them.kiemTraMauKhiSaiTruongBatBuoc(driver);
	  }
	  
	  @Test(priority = 2)
	  public void kiemTraMauKhiSaiTruongKhongBatBuoc() throws IOException, InterruptedException {
		 them.kiemTraMauKhiSaiTruongKhongBatBuoc(driver);
	  }
	  
	  @Test(priority = 3)
	  public void kiemTraChucNangNutDongOBuoc1() throws IOException, InterruptedException {
		 them.kiemTraChucNangNutDongOBuoc1(driver);
	  }
	  
	  @Test(priority = 4)
	  public void kiemTraThongBaoNhapNgSinhNhoHon1900() throws IOException, InterruptedException {
		 them.kiemTraThongBaoNhapNgSinhNhoHon1900(driver);
	  }
	  
	  @Test(priority = 5)
	  public void kiemTraThongBaoNhapNgSinhLonHonHienTai() throws IOException, InterruptedException {
		 them.kiemTraThongBaoNhapNgSinhLonHonHienTai(driver);
	  }
	  
	  @Test(priority = 6)
	  public void kiemTraNgaySinhBang1900DuocChapNhan() throws IOException, InterruptedException {
		 them.kiemTraNgaySinhBang1900DuocChapNhan(driver);
	  }
	  
	  @Test(priority = 7)
	  public void kiemTraThongBaoTreEmDuoi1TuoiKhongCoNgGiamHo() throws IOException, InterruptedException {
		 them.kiemTraThongBaoTreEmDuoi1TuoiKhongCoNgGiamHo(driver);
	  }
	  
	  @Test(priority = 8)
	  public void kiemTraThongBaoTreEmDuoi1TuoiKhongNhapQHVoiNgGiamHo() throws IOException, InterruptedException {
		 them.kiemTraThongBaoTreEmDuoi1TuoiKhongNhapQHVoiNgGiamHo(driver);
	  }
	  
	  @Test(priority = 9)
	  public void kiemTraThongBaoKhiBoTrongTruongDanToc() throws IOException, InterruptedException {
		 them.kiemTraThongBaoKhiBoTrongTruongDanToc(driver);
	  }
	  
	  @Test(priority = 10)
	  public void kiemTraThongBaoKhiBoTrongTruongQuocTich() throws IOException, InterruptedException {
		 them.kiemTraThongBaoKhiBoTrongTruongQuocTich(driver);
	  }
	  
	  @Test(priority = 11)
	  public void kiemTraThongBaoKhiBoTrongTruongTonGiao() throws IOException, InterruptedException {
		 them.kiemTraThongBaoKhiBoTrongTruongTonGiao(driver);
	  }
	  
	  @Test(priority = 12)
	  public void kiemTraMauKhungBoTrongDanTocQuocTichTonGiao() throws IOException, InterruptedException {
		 them.kiemTraMauKhungBoTrongDanTocQuocTichTonGiao(driver);
	  }
	  
	  @Test(priority = 13)
	  public void kiemTraNutLuuMH2KhiNhapThieuThongTin() throws IOException, InterruptedException {
		 them.kiemTraNutLuuMH2KhiNhapThieuThongTin(driver);
	  }
	  
	  @Test(priority = 14)
	  public void kiemTraChucNangNutQuayLaiMH2() throws IOException, InterruptedException {
		 them.kiemTraChucNangNutQuayLaiMH2(driver);
	  }
	  
	  @Test(priority = 15)
	  public void kiemTraChucNangNutDongMH2() throws IOException, InterruptedException {
		 them.kiemTraChucNangNutDongMH2(driver);
	  }
	
	  @Test(priority = 16)
	  public void kiemTraNutLuuMH2KhiNhapDayDuDuLieu() throws IOException, InterruptedException {
		 them.kiemTraNutLuuMH2KhiNhapDayDuDuLieu(driver);
	  }
	  
	  @Test(priority = 17)
	  public void kiemTraChucNangNutXemThongTinNK() throws IOException, InterruptedException {
		 them.kiemTraChucNangNutXemThongTinNK(driver);
	  }
	  
	  @Test(priority = 18)
	  public void kiemTraClickNutSuaThongTinNhanKhauSangMHThemMoiHoacSuaThongTinCaNhan() throws IOException, InterruptedException {
		 them.kiemTraClickNutSuaThongTinNhanKhauSangMHThemMoiHoacSuaThongTinCaNhan(driver);
	  }
	  
	  @Test(priority = 19)
	  public void kiemTraThongBaoKhiNhapThongTinBoMeLaChinhNhanKhauDangXet() throws IOException, InterruptedException {
		 them.kiemTraThongBaoKhiNhapThongTinBoMeLaChinhNhanKhauDangXet(driver);
	  }
	  
	  @Test(priority = 20)
	  public void kiemTraClickNutXoaThongTinNhanKhauSangMHXacNhanHanhDongXoa() throws IOException, InterruptedException {
		 them.kiemTraClickNutXoaThongTinNhanKhauSangMHXacNhanHanhDongXoa(driver);
	  }
	  
	  @AfterClass
		public void close(){
			driver.close();
		}
}
