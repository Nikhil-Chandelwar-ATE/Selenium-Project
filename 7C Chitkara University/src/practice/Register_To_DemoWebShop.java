package practice;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_To_DemoWebShop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Random random = new Random();
		int num = random.nextInt(100);
		String email = "chitkara"+num+"@gmail.com";
		
		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
		if (registerLink.isDisplayed()) {
			System.out.println("Navigating to Demo Web Shop");
			registerLink.click();
			WebElement registerHeading = driver.findElement(By.xpath("//h1[text()='Register']"));
			if (registerHeading.isDisplayed()) {
				System.out.println("Navigating to Register Page");
				driver.findElement(By.xpath("//input[@id='gender-male']")).click();
				driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Aman");
				driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kumar");
				driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("aman@123");
				driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("aman@123");
				driver.findElement(By.xpath("//input[@id='register-button']")).click();
				Thread.sleep(2000);
				WebElement registrationMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
				if (registrationMessage.isDisplayed()) {
					System.out.println("user is registered successfully.....");
				}
				else {
					System.out.println("Not registered.......");
				}
			}
		}
	}

}
