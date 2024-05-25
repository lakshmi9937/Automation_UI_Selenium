package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[@class='search_btn loginText ng-star-inserted']")).click();
		driver.findElement(By.xpath("//input[@id='4606007']")).sendKeys("mln111000");
		driver.findElement(By.xpath("//input[@id='9965855']")).sendKeys("honey143");
		
	}

}
