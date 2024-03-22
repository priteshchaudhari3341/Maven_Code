package ExcelR.SeleniumOctTraining;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups = {"Regression","Sanity"})
	public void testcase1() {

		System.out.println("TestCase 1");

	}

	@Test (groups = {"Sanity"})
	public void testcase2() {

		System.out.println("TestCase 2");

	}

	@Test(groups = {"Smoke"})
	public void testcase3() {

		System.out.println("TestCase 3");

	}
	

}
