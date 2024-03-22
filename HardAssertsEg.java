package ExcelR.SeleniumOctTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertsEg {
	
	@Test
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sony\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		
		String actual = driver.getTitle();
		
		String expected = "OrangeHR";
		
		Assert.assertEquals(actual,expected);
	}
	

}
