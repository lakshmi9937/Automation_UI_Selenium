package Assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();	
String[] itemNeeded = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		WebDriverWait w = new WebDriverWait(driver,10);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		//driver.findElement(By.cssSelector("//select[@class='form-control']"));
        WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
		//Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.nav-link.btn.btn-primary")));
		
		List<WebElement> products=driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		for(int i=0;i<products.size();i++) {
			String name = products.get(i).getText();
			List itemNeededList = Arrays.asList(itemNeeded);
			if(itemNeededList.contains(name)) {
				driver.findElements(By.xpath("//button[text()='btnbtn-info']")).get(i).click();
			}
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	}

}
