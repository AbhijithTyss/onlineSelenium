package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {//testNg class
	
	@Test
	public void test() {// test case
		// test steps
		Reporter.log("test running",true);
	}
	
	@Test
	public void demo() {// test case
		// test steps
		Reporter.log("demo running",true);
	}
	
	@Test
	public void sample() {// test case
		// test steps
		Reporter.log("sample running",true);
	}
}
