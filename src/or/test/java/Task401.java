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
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
        username.sendKeys("poovitha28.ece@gmail.com");
        WebElement btn = driver.findElement(By.xpath("//span[text()='Next']"));
        btn.click();
        
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
       // ("9789994848");
        WebElement btn1 = driver.findElement(By.xpath("//span[text()='Next']"));
        btn1.click();
        
 
		
		
		
	}

}
