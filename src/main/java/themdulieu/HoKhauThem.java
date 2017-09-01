package themdulieu;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectQLHoKhauDeclare;
import genneral.ObjectQLNhanKhauDeclare;

public class HoKhauThem {
	public void timKiem(WebDriver driver) {
		try {
			Thread.sleep(1000);
			Method.senKey(driver, ObjectQLHoKhauDeclare.txtChuHo(), ExcelUntil.getData(17, 2));
			Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiem());
			Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacXoa());
			Method.click(driver, ObjectQLHoKhauDeclare.btnXoa());
		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho nay");
		}
	}


	public void themHoKhau(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		timKiem(driver);
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemMoiHK());
		Method.click(driver, ObjectQLHoKhauDeclare.dropChuHo());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(17, 3));
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		Method.implicitlyWait(driver, 5);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuu());
		soSanhChuHo(driver);
	}

	public void soSanhChuHo(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHoKhauDeclare.linkChuHo());
		Thread.sleep(1000);
		String getmaYTCN = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(17, 3);

		String getQHChuHo = Method.getText(driver, ObjectQLHoKhauDeclare.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(17, 4);
//		Thread.sleep(3000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDong());
	}

	public void themNKVaoHK(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnThemNhanKhau());
		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnChonDSNhanKhau());
		Method.senKey(driver, ObjectQLHoKhauDeclare.txtMaYTCNSearch(), ExcelUntil.getData(18, 3));
		Method.click(driver, ObjectQLHoKhauDeclare.btnTimKiemSearch());
		Thread.sleep(2000);

		Method.click(driver, ObjectQLHoKhauDeclare.btnThaoTacSearch());
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Con");

		Thread.sleep(1000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnLuuThemNK());
		soSanhThemNK(driver);
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDongHoKhau());
	}

	public void soSanhThemNK(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(2000);
		Method.click(driver, ObjectQLHoKhauDeclare.linkNK());
		Thread.sleep(1000);
		String getmaYTCN = Method.getText(driver, ObjectQLHoKhauDeclare.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(18, 3);

		String getQHChuHo = Method.getText(driver, ObjectQLHoKhauDeclare.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(18, 4);
		Assert.assertEquals(maYTCN, getmaYTCN);
		Assert.assertEquals(qHChuHo, getQHChuHo);

		Thread.sleep(2000);
		Method.click(driver, ObjectQLHoKhauDeclare.btnDong());
	}
}
