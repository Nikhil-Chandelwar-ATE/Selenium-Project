package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority_Attribute {

	@Test(priority = 1)
	public void register() {
		Reporter.log("Executing register test case.....",true);
	}
	
	@Test(priority = 2)
	public void login() {
		Reporter.log("Executing login test case.....",true);
	}
	
	@Test(priority = 3)
	public void search() {
		Reporter.log("Executing search test case.....",true);
	}
}
