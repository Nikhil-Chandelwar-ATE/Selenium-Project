package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_File {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String firstName = Utility_Class.getExcelData("Register_TC", 1, 0);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_Class.getPropertyValue("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
	}

}
