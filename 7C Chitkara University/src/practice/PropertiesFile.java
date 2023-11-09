package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./testData/commandata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}

}
