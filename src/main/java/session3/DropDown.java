package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class DropDown {
	WebDriver driver;
	@Before
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void weElement() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
	       js.executeScript("scroll(0,2000)");
		
	
	
	
	
	
	
	
	
	
	
	}
		

}
