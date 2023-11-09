package testNG_Basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count_Attribute {

	@Test(invocationCount = 5)
	public void register() {
		Reporter.log("Executing register test case.....",true);
	}
}
