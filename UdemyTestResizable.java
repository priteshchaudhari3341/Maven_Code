package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UdemyTestResizable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(resizable, 400, 400).perform();
		

	}

}
