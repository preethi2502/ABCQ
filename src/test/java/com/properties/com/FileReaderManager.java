package com.properties.com;

public class FileReaderManager {

	//SINGLETON DESIGN PATTERN
	//this help to stop creation of objects
	private FileReaderManager() {
	}

	//current class method should be static
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	//another class method this is not static 
	public ConfigReader getInstanceCR() throws Exception {
		ConfigReader cr = new ConfigReader();
		return cr;
	}

}
