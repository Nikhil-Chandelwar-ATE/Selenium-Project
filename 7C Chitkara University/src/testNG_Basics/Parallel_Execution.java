package testNG_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel_Execution {

	@Test(invocationCount = 5,threadPoolSize = 5)
	public void register() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Executing register test case.....",true);
	}
}
