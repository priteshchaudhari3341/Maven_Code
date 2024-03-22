package ExcelR.SeleniumOctTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestNewTabAndWindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.way2automation.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.gmail.com/");
		
		System.out.println(driver.getTitle());
		
		
		System.out.println(driver.getWindowHandles().size());
		
		Set<String> winids = driver.getWindowHandles();
		
		Iterator<String>iterator = winids.iterator();
		
		
		List<String> winIndex = new ArrayList<String>();
		
		while(iterator.hasNext()) {
			
			winIndex.add(iterator.next());
		}
		
		driver.switchTo().window(winIndex.get(0));
		
		System.out.println("First window title is :" + driver.getTitle());
		
		driver.close();
		
        driver.switchTo().window(winIndex.get(1));
		
		System.out.println("Second window title is :" + driver.getTitle());
		
		driver.close();
		
        driver.switchTo().window(winIndex.get(2));
		
		System.out.println("Third window title is :" + driver.getTitle());
		
		driver.quit();

	}

}
