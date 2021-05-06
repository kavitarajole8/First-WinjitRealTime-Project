package ConfigReader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	//To load path of the file to string
	Properties properties;

	public ConfigDataProvider() {
		File src = new File("./ConfigFiles/Config.properties");
		try {
			//load file
			FileInputStream fis = new FileInputStream(src);
			properties.load(fis);
		}
		catch(Exception exception) {
			System.out.println("Not able to load config file");
		}
	}
	public String getDataFromConfig(String keyToSearch) {
		return properties.getProperty(keyToSearch);

	}
	public String getBrowser() {
		return properties.getProperty("Browser");

	}
	public String getStringURL() {
		return properties.getProperty("qaURL");

	}
	public String getUsername() {
		return properties.getProperty("username");

	}
	public String getPassword() {
		return properties.getProperty("password");

	}
	public String getVersion() {
		return properties.getProperty("version");

	}
}
