package ChromeDevTools;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestScreenShot {
	
	public static WebDriver driver;
	
	public static void captureScreenshot() throws IOException {
		
        Date d = new Date();
		
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot,new File(".//screenshot//"+fileName));
		
	}

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

	    driver = new ChromeDriver();

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
		
			captureScreenshot();
			
		}

	}

}
