package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookSignUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lakshmi");
		driver.findElement(By.name("lastname")).sendKeys("Narayana");
		driver.findElement(By.name("reg_email__")).sendKeys("narayana111000@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Narayana21@");
		driver.findElement(By.id("day")).sendKeys("14");
		driver.findElement(By.id("month")).sendKeys("06");
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.className("_58mt")).sendKeys("1990");
		driver.findElement(By.name("websubmit")).click();

	}

}
