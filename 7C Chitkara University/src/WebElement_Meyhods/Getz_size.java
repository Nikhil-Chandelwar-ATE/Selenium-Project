package WebElement_Meyhods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getz_size {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		
		WebElement registerButton = driver.findElement(By.id("register-button"));
		System.out.println(registerButton.getSize());
		System.out.println("====================");
		System.out.println(registerButton.getSize().getHeight());
		System.out.println(registerButton.getSize().getWidth());
	}

}
