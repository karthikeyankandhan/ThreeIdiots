package or.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\WindowHandling\\driver\\chromedriverVersion76.1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php ");			
		WebElement search = driver.findElement(By.xpath("//p[contains(text(),'')][1]"));
		String element = search.getText();
		
		System.out.println("element");

	}

}
