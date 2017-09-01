package genneral;

import org.openqa.selenium.By;

public class ObjectLoginDeclare {
	public static By txtUsername() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[3]/div/input");
	}

	public static By txtPassword() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[4]/div/input");
	}

	public static By btnLogin() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[5]/button");
	}

	public static By messageBoTrongTK() {
		return By.xpath(".//*[@class='alert alert-danger']/span[2]");
	}
	
	public static By messageBoTrongMK() {
		return By.xpath(".//*[@class='alert alert-danger']/span[3]");
	}
	
	public static By messageNhapSaiMK() {
		return By.xpath(".//*[@class='alert alert-danger']/span[1]");
	}
	
	public static By btnTrangChu() {
		return By.xpath(".//*[@class='fa fa-home']");
	}
}
