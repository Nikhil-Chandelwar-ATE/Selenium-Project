package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties_File {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("./data/commandata.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String URL = prop.getProperty("url");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_Class.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
