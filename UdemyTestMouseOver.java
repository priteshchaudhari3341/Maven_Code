package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyTestMouseOver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
		//Thread.sleep(30000);
		
		//driver.findElement(By.xpath("//div[@class='dialog-close-button dialog-lightbox-close-button']")).click();
		
		WebElement menu = driver.findElement(By.id("menu-item-27617"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice Site 1")).click();
		

	}

}
