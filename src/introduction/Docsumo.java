package introduction;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Docsumo {
	
	static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.docsumo.com");
		
		 Actions action = new Actions(driver);
		 
		WebElement toolsMenu = driver.findElement(By.xpath("(//div[@class='nav-dropdown-icon w-icon-dropdown-toggle'])[2]"));
		action.moveToElement(toolsMenu).perform();
		WebElement splitPdfOption = driver.findElement(By.linkText("Split PDF by Page"));
        splitPdfOption.click();
        Robot robot = new Robot();        
        WebElement upload = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/a[1]"));
//        upload.click();
        upload.sendKeys("‪C:\\Users\\Admin\\Doc.pdf.pdf");
        System.out.println("hi rokdflgjfg");
//        uploadfile.click();
//        Thread.sleep(2000);
//        uploadfile.sendKeys("‪C:\\Users\\Admin\\Doc.pdf.pdf");
  	}

}
