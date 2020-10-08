package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class IFrame {
	WebDriver driver;

	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void Webelement() {
		
		  driver.switchTo().frame("packageListFrame");
		  driver.findElement(By.linkText("java.awt")).click();
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame("packageFrame");
		  //driver.findElement(By.linkText("Adjustable")).click();
driver.findElement(By.className("interfaceName")).click();
		  
		
		  
		 
	}
}
