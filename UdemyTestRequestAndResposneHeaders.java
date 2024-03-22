package ChromeDevTools;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.network.Network;
import org.openqa.selenium.devtools.v115.network.model.Headers;

public class UdemyTestRequestAndResposneHeaders {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Testing classes\\Download files from C drive\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		 
		devTools.addListener(Network.requestWillBeSent(), request -> {
 
			Headers header = request.getRequest().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Request Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
 
		});
 
		devTools.addListener(Network.responseReceived(), response -> {
 
			Headers header = response.getResponse().getHeaders();
 
			if (!header.isEmpty()) {
 
				System.out.println("Response Headers: ");
				header.forEach((key, value) -> {
 
					System.out.println("  " + key + " = " + value);
 
				});
 
			}
			
			System.out.println("Response URL is : "+response.getResponse().getUrl()+"  status code is : "+response.getResponse().getStatus());
			
		});
		
		Map<String, Object> headers = new HashMap<String,Object>();
		headers.put("customHeaderName", "customHeaderValue");
		headers.put("Pritesh", "Automation Tester");
		Headers head = new Headers(headers);
		devTools.send(Network.setExtraHTTPHeaders(head));
		
 
		
		driver.get("http://flipkart.com");
		
		//driver.get("https://reqres.in/api/users?page=2");

	}

}