package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRead {
	
	public static String readData(String path,String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(path);

		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
	
	public static int readIntData(String path,String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(path);

		Properties prop = new Properties();
		
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		int data = Integer.parseInt(value);
		
		return data;
		
	}

}
