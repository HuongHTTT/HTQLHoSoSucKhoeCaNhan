package genneral;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Method {
	public static WebElement  findElement(WebDriver driver, By local) {
		return driver.findElement(local);
	}

	public static void  senKey(WebDriver driver, By local, String value) {
		WebElement ele = driver.findElement(local);
		if(ele != null){
			ele.clear();
			ele.sendKeys(value);
		}else{
			ele.sendKeys(value);
		}
	}
	
	public static void senKeyNotClear(WebDriver driver, By local, String value) {
		WebElement ele = driver.findElement(local);
		ele.sendKeys(value);

	}

	public static void  click(WebDriver driver, By local) {
		driver.findElement(local).click();
	}

	public static void  clear(WebDriver driver, By local) {
		driver.findElement(local).clear();
	}

	public static String  getText(WebDriver driver, By local) {
		String text = driver.findElement(local).getText();
		return text;
	}

	public static boolean elementEnable(WebDriver driver, By local) {
		Boolean element = driver.findElement(local).isEnabled();
		return element;
	}
	
	public static boolean elementDisplay(WebDriver driver, By local) {
		Boolean element = driver.findElement(local).isDisplayed();
		return element;
	}

	public static void implicitlyWait (WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
}
