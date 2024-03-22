package ChromeDevTools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.emulation.Emulation;

public class UdemyTestOverrideTimeZone {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://whatismytimezone.com/");
		
		Thread.sleep(5000);
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Emulation.setTimezoneOverride("EST"));
		
		driver.get("https://whatismytimezone.com/");
		
		

	}

}
