package ChromeDevTools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class UdemyTestDeviceMetrics {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Emulation.setDeviceMetricsOverride(375, 812, 50, true,
				
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty(),
				 Optional.empty()));
		
		driver.get("https://selenium.dev/");*/
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		Map<String, Object> deviceMetrics = new HashMap<String, Object>() {
			 
			{
 
				put("width", 375);
				put("height", 812);
				put("mobile", true);
				put("deviceScaleFactor", 50);
			}
 
		};
 
		((ChromeDriver) driver).executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		
		driver.get("https://selenium.dev/");
		
		
		

	}

}
