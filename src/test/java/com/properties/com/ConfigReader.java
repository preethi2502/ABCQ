package com.properties.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public static Properties p;

	public ConfigReader() throws Exception {
		File f = new File(
				"C:\\Users\\ADMIN\\eclipse-workspace\\new\\ZCucumber\\src\\test\\java\\com\\properties\\com\\ConfigurationData.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

}
