package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		driver.findElement(By.linkText("Register")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("gender-male"))));
		driver.findElement(By.id("gender-male")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("FirstName"))));
		driver.findElement(By.id("FirstName")).sendKeys("abcde");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("LastName"))));
		driver.findElement(By.id("LastName")).sendKeys("fghij");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Email"))));
		driver.findElement(By.id("Email")).sendKeys("abcdefghij@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Password"))));
		driver.findElement(By.id("Password")).sendKeys("abcde@123fghij");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("ConfirmPassword"))));
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcde@123fghij");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("register-button"))));
		driver.findElement(By.id("register-button")).click();
	}
}
