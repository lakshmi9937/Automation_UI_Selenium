package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.findElement(By.id("inputUsername")).sendKeys("Suresh");
driver.findElement(By.name("inputPassword")).sendKeys("1235");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.id("chkboxTwo")).click();
driver.findElement(By.className("submit")).click();
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.id("chkboxTwo")).click();
driver.findElement(By.xpath("//div/a")).click();
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Suresh Reddy");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sureshnarrala");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9494798569");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
driver.findElement(By.cssSelector("button[class=go-to-login-btn]")).click();
driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Suresh Reddy");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
Thread.sleep(1000);
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

	}

}
