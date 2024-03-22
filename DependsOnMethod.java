package ExcelR.SeleniumOctTraining;

import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void checkout() {

		System.out.println("checkout");

	}

	@Test
	public void login() {

		System.out.println("login");

	}

	@Test
	public void paymentgatway() {

		System.out.println("paymentgatway");

	}

	@Test(dependsOnMethods = { "paymentgatway" })
	public void ordergeneration() {

		System.out.println("ordergeneration");

	}
}
