package ExcelR.SeleniumOctTraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void opendb() {

		System.out.println("Executing before every suite");
	}

	@BeforeTest
	public void launchbrowser() {

		System.out.println("Executing before every tests");
	}

	@BeforeClass
	public void createorder() {

		System.out.println("Executing before every class");
	}

	@BeforeMethod
	public void testdatacreations() {

		System.out.println("Executing before every methos");
	}

	@Test
	public void testcase1() {

		System.out.println("TestCase 1");

	}

	@Test
	public void testcase2() {

		System.out.println("TestCase 2");

	}

	@Test
	public void testcase3() {

		System.out.println("TestCase 3");

	}

	@AfterMethod
	public void testdatadeletion() {

		System.out.println("Executing after every method");
	}

	@AfterClass
	public void deleteorder() {

		System.out.println("Executing after every class");
	}

	@AfterTest
	public void exitbrowser() {

		System.out.println("Executing after every tests");
	}

	@AfterSuite
	public void closedb() {

		System.out.println("Executing after every suite");
	}

}
