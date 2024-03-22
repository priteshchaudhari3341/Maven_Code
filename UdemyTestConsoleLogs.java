package ChromeDevTools;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.console.Console;
import org.openqa.selenium.devtools.v115.log.Log;

public class UdemyTestConsoleLogs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Log.enable());
		
		devTools.send(Console.enable());
		
		devTools.addListener(Log.entryAdded(), entry ->{
 
			System.out.println("Text is : "+entry.getText());
			
			System.out.println("TimeStamp is : "+entry.getTimestamp());
			
			System.out.println("Source is : "+entry.getSource());
			
			System.out.println("Level is : "+entry.getLevel());	
			
		});
		
		devTools.addListener(Console.messageAdded(), message ->{
 
			System.out.println("Console Text is : "+message.getText());
 
		});
		
		driver.get("http://flipkart.com");
		
		((JavascriptExecutor) driver).executeScript("console.log('This is a sample log')");
 
 
	}

}
