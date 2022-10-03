package com.baseclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid");
		}
		return driver;
	}

	public static void getUrl(String str) {
		driver.get(str);
	}
	public static void sendKeys( WebElement ele,String str) {
		ele.sendKeys(str);
	}

	public static void click(WebElement ele) {
		ele.click();

	}

	private void close() {
		System.out.println("page closed");
		driver.close();
	}

	private void quit() {

		System.out.println("browser closed");
		driver.quit();
	}
}
