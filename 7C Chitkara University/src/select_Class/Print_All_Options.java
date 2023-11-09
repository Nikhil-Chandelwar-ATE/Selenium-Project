package select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_All_Options {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium/demo.html");
		Thread.sleep(2000);
		
		//Step 1 Create the object of Select class
		WebElement courseDD = driver.findElement(By.id("standard_cars"));
		Select select = new Select(courseDD);
		
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
			System.out.println("===================");
		}
		driver.quit();
	}

}
