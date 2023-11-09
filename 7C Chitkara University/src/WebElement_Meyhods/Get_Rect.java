package WebElement_Meyhods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Rect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.id("register-button"));
		System.out.println("X axis = "+registerButton.getRect().getX());
		System.out.println("Y axis = "+registerButton.getRect().getY());
		System.out.println("Height = "+registerButton.getRect().getHeight());
		System.out.println("Width = "+registerButton.getRect().getWidth());
	}

}
