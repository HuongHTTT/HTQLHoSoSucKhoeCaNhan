package login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import genneral.ExcelUntil;
import genneral.Method;
import genneral.ObjectLoginDeclare;

public class Login {
	public void boTrongTK(WebDriver driver) {
		Method.click(driver, ObjectLoginDeclare.btnLogin());
		String getMessage = Method.getText(driver, ObjectLoginDeclare.messageBoTrongTK());
		String message = ExcelUntil.getData(8, 4);
		Assert.assertEquals(getMessage, message);
	}

	public void boTrongMK(WebDriver driver) {
		Method.senKey(driver, ObjectLoginDeclare.txtUsername(), ExcelUntil.getData(9, 2));
		Method.click(driver, ObjectLoginDeclare.btnLogin());
		String getMessage = Method.getText(driver, ObjectLoginDeclare.messageBoTrongMK());
		String message = ExcelUntil.getData(9, 4);
		Assert.assertEquals(getMessage, message);
	}

	public void boTrongTenDN(WebDriver driver) {
		Method.senKey(driver, ObjectLoginDeclare.txtUsername(), ExcelUntil.getData(10, 2));
		Method.senKey(driver, ObjectLoginDeclare.txtPassword(), ExcelUntil.getData(10, 3));
		Method.click(driver, ObjectLoginDeclare.txtUsername());
		Method.click(driver, ObjectLoginDeclare.btnLogin());
		String getMessage = Method.getText(driver, ObjectLoginDeclare.messageBoTrongTK());
		String message = ExcelUntil.getData(10, 4);
		Assert.assertEquals(getMessage, message);
	}

	public void nhapSaiMK(WebDriver driver) throws InterruptedException {
		Method.senKey(driver, ObjectLoginDeclare.txtUsername(), ExcelUntil.getData(11, 2));
		Method.senKey(driver, ObjectLoginDeclare.txtPassword(), ExcelUntil.getData(11, 3));
		Method.click(driver, ObjectLoginDeclare.txtUsername());
		Method.click(driver, ObjectLoginDeclare.btnLogin());
		String getMessage = Method.getText(driver, ObjectLoginDeclare.messageNhapSaiMK());
		String message = ExcelUntil.getData(11, 4);
		Assert.assertEquals(getMessage, message);
	}
	
	public void nhapdungTK(WebDriver driver) throws InterruptedException {
		Method.senKey(driver, ObjectLoginDeclare.txtUsername(), ExcelUntil.getData(12, 2));
		Method.senKey(driver, ObjectLoginDeclare.txtPassword(), ExcelUntil.getData(12, 3));
		Method.click(driver, ObjectLoginDeclare.txtUsername());
		Method.click(driver, ObjectLoginDeclare.btnLogin());
		Thread.sleep(1000);
		Boolean check = Method.elementDisplay(driver, ObjectLoginDeclare.btnTrangChu());
		Assert.assertTrue(check);
	}
	
	public void LoginValid(WebDriver driver) throws InterruptedException {
		Thread.sleep(1000);
		Method.senKey(driver, ObjectLoginDeclare.txtUsername(), "tandd");
		Method.senKey(driver, ObjectLoginDeclare.txtPassword(), "123456aA@");
		Method.click(driver, ObjectLoginDeclare.txtUsername()); 
		Method.click(driver, ObjectLoginDeclare.btnLogin()); 
		
	}
}
