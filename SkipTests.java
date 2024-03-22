package ExcelR.SeleniumOctTraining;

import org.testng.annotations.Test;

public class SkipTests {
	
	@Test(enabled = false)
	public void testcase1() {

		System.out.println("TestCase 1");

	}

	@Test(priority = 2)
	public void testcase2() {

		System.out.println("TestCase 2");

	}

	@Test(priority = 1)
	public void testcase3() {

		System.out.println("TestCase 3");

	}

}
