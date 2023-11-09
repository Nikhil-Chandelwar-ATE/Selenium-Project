package WebElement_Meyhods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.xpath("//input[@class='form-control']"));
		System.out.println(registerButton.isEnabled());
	}

}
