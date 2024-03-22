package ChromeDevTools;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import org.openqa.selenium.Point;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestElementScreenshot {

	public static WebDriver driver;

	public static void captureScreenshot() throws IOException {
		
		Date d = new Date();

		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot, new File(".//screenshot//" + fileName));

	}
	
	public static void captureEleScreenshot(WebElement ele) throws IOException {
		
		Date d = new Date();

		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		BufferedImage fullImg = ImageIO.read(screenshot);
		
		Point point = ele.getLocation();
		
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "jpg", screenshot);

		File screenshotLocation = new File(".\\screenshot\\" + fileName);
		FileUtils.copyFile(screenshot, screenshotLocation);
		
	}

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.way2automation.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//*[@id=\"MzYwOjY4NA==-1\"]"));

		captureEleScreenshot(ele);
		
		

	}

}
