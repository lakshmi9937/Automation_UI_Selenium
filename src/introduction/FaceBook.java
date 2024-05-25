package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	
	static WebDriver driver;

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();


//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("lakshmi111000");
		driver.findElement(By.id("pass")).sendKeys("9533979713");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	}

}
