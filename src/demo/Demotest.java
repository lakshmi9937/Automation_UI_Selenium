package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demotest {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.docsumo.com");
		
		 Actions action = new Actions(driver);
		 
		WebElement toolsMenu = driver.findElement(By.xpath("(//div[@class='nav-dropdown-icon w-icon-dropdown-toggle'])[2]"));
		action.moveToElement(toolsMenu).perform();
		WebElement splitPdfOption = driver.findElement(By.linkText("Split PDF by Page"));
        splitPdfOption.click();
        
        WebElement uploadfile = driver.findElement(By.id("pdf_button"));
        uploadfile.click();
       // uploadfile.send_keys('C:\\Users\\Admin\\Doc.pdf');
        Thread.sleep(2000);
        uploadfile.sendKeys("C:/Users/Admin/Doc.pdf");
        

	}

}
