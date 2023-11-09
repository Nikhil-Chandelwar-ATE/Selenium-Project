package WebElement_Meyhods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Css_Value {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		System.out.println(searchButton.getCssValue("color"));
		System.out.println(searchButton.getCssValue("font"));
	}

}
