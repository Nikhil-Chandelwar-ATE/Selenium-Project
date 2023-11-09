package select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect_All_Options {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/selenium/demo.html");
		Thread.sleep(2000);
		
		//Step 1 Create the object of Select class
		WebElement carsDD = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(carsDD);
		
		//Select all options one by one
		for (int i = 1; i < sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		//Print all selected options
		for (WebElement option : sel.getAllSelectedOptions()) {
			System.out.println(option.getText());
			System.out.println("=================");
		}
		
		//Deselect all selected options one by one
		for (int i = 1; i <= sel.getAllSelectedOptions().size(); i++) {
			sel.deselectByIndex(i);
			Thread.sleep(1000);
		}
	}
}
