package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestRectangle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gmail.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement img = driver.findElement(By.xpath("//div[@id='logo']"));
		
		Rectangle rect = img.getRect();
		
		System.out.println("Height : " +rect.getHeight());
		System.out.println("Width : " +rect.getWidth());
		System.out.println("X coord : " +rect.getX());
		System.out.println("Y coord : " +rect.getY());

	}

}
