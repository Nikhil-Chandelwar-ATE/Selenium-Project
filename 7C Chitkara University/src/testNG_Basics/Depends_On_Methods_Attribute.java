package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_On_Methods_Attribute {

	@Test
	public void register() {
		Reporter.log("Executing register test case.....",true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		Reporter.log("Executing login test case.....",true);
	}
	
	@Test(dependsOnMethods = {"register","login"})
	public void search() {
		Reporter.log("Executing search test case.....",true);
	}
}
