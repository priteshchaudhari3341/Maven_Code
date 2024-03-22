package ExcelR.SeleniumOctTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyTestTabsAndPopups {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("---- Generating window ids from first window ----");
		
		Set<String> winids = driver.getWindowHandles();
		
		Iterator<String> iterate = winids.iterator();
		
		String first_window = iterate.next();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[13]/div[1]/div/div/div[1]/div/div[3]/div/div/div/div/div[1]/div/div/div[2]/div/div/div[1]/a/img")).click();
		
		//2nd Windows
		
        System.out.println("---- Generating window ids from second window ----");
		
		winids = driver.getWindowHandles();
		
		iterate = winids.iterator();
		
		System.out.println(iterate.next());// first window
		
		String second_window = iterate.next();// second window
		
		System.out.println(second_window);
		
		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("//*[@id=\"container-3fda560304\"]/div/div/div/header/section/div/div[3]/a[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='login-btn']")).click();
		
		Thread.sleep(3000);
		
		//3rd windows
		
		 System.out.println("---- Generating window ids from third window ----");
			
			winids = driver.getWindowHandles();
			
			iterate = winids.iterator();
			
			System.out.println(iterate.next());// first window
			
			System.out.println(iterate.next());// second window
			
			String third_window = iterate.next();// third window
			
			System.out.println(third_window);
			
			driver.switchTo().window(third_window);
			
			System.out.println(driver.getTitle().contains("FASTag Charges"));
			
		/*	driver.close(); //3rd window
			
			driver.switchTo().window(second_window);
			
			driver.close();*/
			
			driver.quit();

	}

}
