package session3;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mail_Login {
	WebDriver driver;
	@Before
public void Launchbrowser() {
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https://www.yahoo.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
	@Test
public void login() throws InterruptedException {
	driver.findElement(By.id("login-username")).sendKeys("msunarc");

	Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.id("login-passwd")).sendKeys("1974@Siva");
	
	Actions act1=new Actions(driver);
	act1.sendKeys(Keys.ENTER).build().perform();
	Thread.sleep(2000);
	
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("scroll(0,8000)");
	 
	
	}
}
