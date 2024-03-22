package ExcelR.SeleniumOctTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners(ListnerTest.class)

public class Login {
	
	public void login() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sony\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.geeksforgeeks.org/");

		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		String expectedtitle = "Hello";
		
		Assert.assertEquals(title,expectedtitle);
		
	
	}

}
