package ExcelR.SeleniumOctTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemySwitchingToParentFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_frames2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//*[@id=\"nav_translate_btn\"]/i")).click();
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("iframeResult");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());

	}

}
