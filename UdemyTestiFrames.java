package ExcelR.SeleniumOctTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestiFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println(frames.size());

		for (WebElement frame : frames) {

			System.out.println(frame.getAttribute("id"));
		}

	}

}
