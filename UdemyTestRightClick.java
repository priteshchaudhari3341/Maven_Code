package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UdemyTestRightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement img = driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		
		Actions action =  new Actions(driver);
		
		action.contextClick(img).perform();
		
		driver.findElement(By.id("dm2m1i1tdT")).click();
		
		driver.findElement(By.id("dm2m2i1tdT")).click();
		
		driver.findElement(By.id("dm2m3i1tdT")).click();

	}

}
