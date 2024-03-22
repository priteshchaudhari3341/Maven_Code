package ExcelR.SeleniumOctTraining;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class ParallelTests {
	
	
	@Test
	
	public void invokechrome() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sony\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.geeksforgeeks.org/");

		driver.manage().window().maximize();
	}
	
	@Test
	
	public void invokeff() {
		
		System.setProperty("webdriver.firefox.driver",
				"C:\\\\Users\\\\Sony\\\\Downloads\\\\Browser Drivers\\\\Browsers\\\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.geeksforgeeks.org/");

		driver.manage().window().maximize();
	}

}
