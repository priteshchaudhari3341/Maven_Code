package ExcelR.SeleniumOctTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.*;

public class Parameterizedtests {

	@Parameters("browser")
	@Test

	public void invokebrowser(String browser) {

		if (browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Sony\\\\Downloads\\\\geckodriver-v0.33.0-win64\\\\geckodriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.geeksforgeeks.org/");

			driver.manage().window().maximize();

		} else {

			System.setProperty("webdriver.firefox.driver",
					"C:\\\\Users\\\\Sony\\\\Downloads\\\\Browser Drivers\\\\Browsers\\\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.geeksforgeeks.org/");

			driver.manage().window().maximize();

		}

	}

}
