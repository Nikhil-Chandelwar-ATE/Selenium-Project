package working_With_WebDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[contains(@class,'rR')]"));
		for (WebElement mobile : mobileList) {
			String mobileName = mobile.getText();
			System.out.println(mobile.getText());
			System.out.println("================");
			String xpath = "//div[text()='"+mobileName+"']/../../../..//div[contains(@class,'_WHN')]";
			WebElement price = driver.findElement(By.xpath(xpath));
			System.out.println(price.getText());
			System.out.println("================");
		}
		driver.quit();
	}

}
