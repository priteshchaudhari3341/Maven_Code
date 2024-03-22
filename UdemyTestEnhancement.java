package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UdemyTestEnhancement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		
		int x = link.getRect().getX();
		
		int y = link.getRect().getY();
		
		Actions action = new Actions(driver);
		
		action.moveByOffset(x, y).click().perform();

	}

}
