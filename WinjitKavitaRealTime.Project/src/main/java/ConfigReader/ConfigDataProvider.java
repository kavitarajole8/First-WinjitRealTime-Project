package ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import TestContext.BaseClass;

public class ConfigDataProvider{

	//To load path of the file to string
	Properties propert;

	public ConfigDataProvider() {
		File src = new File("./ConfigFiles/Config.properties");
		try {
			//load file
			FileInputStream fis = new FileInputStream(src);
			propert = new Properties();
			propert.load(fis);
		}
		catch(Exception exception) {
			System.out.println("Not able to load config file");
		}
	}
	public String getDataFromConfig(String keyToSearch) {
		return propert.getProperty(keyToSearch);

	}
	public String getBrowser() {
		return propert.getProperty("Browser");

	}
	public String getStagingURL(){
		return propert.getProperty("qaURL");

	}
	public String getUsername() {
		return propert.getProperty("username");

	}
	public String getPassword() {
		return propert.getProperty("password");

	}
	public String getVersion() {
		return propert.getProperty("version");

	}
}
