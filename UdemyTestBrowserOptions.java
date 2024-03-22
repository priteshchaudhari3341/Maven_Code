package ExcelR.SeleniumOctTraining;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UdemyTestBrowserOptions {

	public static void main(String[] args) {
		
		Map<String,String> mobileEm = new HashMap<String,String>();
		mobileEm.put("deviceName", "iPhone X");
		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless");
		opt.setAcceptInsecureCerts(true);
		//opt.addArguments("disable-infobars");
		//opt.addArguments("window-size=1400,1000");
		opt.addArguments("incognito");
		
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		opt.setExperimentalOption("mobileEmulation", mobileEm);
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://selenium.dev/");
		
		System.out.println(driver.getTitle());
		
		

	}

}
