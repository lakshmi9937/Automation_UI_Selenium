package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShetty
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
	    driver.findElement(By.id("inputUsername")).sendKeys("laskhmi111000@gmail.com");
	    driver.findElement(By.name("inputPassword")).sendKeys("12345");
	    driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
	    driver.findElement(By.className("submit")).click();	    
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    driver.findElement(By.cssSelector("div[class='forgot-pwd-container']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("lakshmi");
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("lakshmi9937@gmail.com");
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9100752299");
	    driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
	    
	    System.out.println(driver.findElement(By.xpath("//form/p")).getText());
	    
	    driver.findElement(By.xpath("//div/button[1]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Lakshmi");
	    driver.findElement(By.xpath("//input[(@placeholder='Password')]")).sendKeys("rahulshettyacademy");
	    Thread.sleep(500);
	    driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	       
	       
	}		
}


