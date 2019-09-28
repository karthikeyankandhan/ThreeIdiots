package or.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task401 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\WindowHandling\\driver\\chromedriverVersion76.1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.quit();
		
		
		
		
	}

}
