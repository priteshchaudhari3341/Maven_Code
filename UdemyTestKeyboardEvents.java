package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UdemyTestKeyboardEvents {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/div[2]")).click();
		
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER); 
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		driver.findElement(By.id("identifierId")).click();
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
			
		

	}

}
