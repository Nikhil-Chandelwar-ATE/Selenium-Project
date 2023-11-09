package working_With_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_Contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//h1[contains(text(),'Welcome')]"));
		System.out.println(text.getText());
		if (text.isDisplayed()) {
			System.out.println(text.isDisplayed());
			System.out.println("Login Page");
		} else {
			System.out.println("Some other page");
		}
		driver.quit();
	}

}
